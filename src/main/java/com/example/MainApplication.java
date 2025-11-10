package com.example;

import com.example.session.SessionDetails;
import org.springframework.aot.hint.MemberCategory;
import org.springframework.aot.hint.RuntimeHints;
import org.springframework.aot.hint.RuntimeHintsRegistrar;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ImportRuntimeHints;
import org.springframework.core.io.ClassPathResource;
import org.springframework.security.web.authentication.WebAuthenticationDetails;
import org.springframework.session.data.redis.config.ConfigureRedisAction;

@SpringBootApplication
@ImportRuntimeHints(MainApplication.ExamplesRuntimeHints.class)
//@EnableRedisHttpSession
public class MainApplication {

    public static void main(String[] args) {
        SpringApplication.run(MainApplication.class, args);
    }

    // config for secure redis environment where admin right not available or SET command not working
    @Bean
    public ConfigureRedisAction configureRedisAction() {
        return ConfigureRedisAction.NO_OP;
    }

    /**
     * For native build below config is required for serializing {@link org.springframework.security.core.Authentication}.
     * Test api/authentication. It will break without this config.
     * {@link org.springframework.security.authentication.UsernamePasswordAuthenticationToken}
     * which use the {@link WebAuthenticationDetails}
     */
    static class ExamplesRuntimeHints implements RuntimeHintsRegistrar {

        @Override
        public void registerHints(RuntimeHints hints, ClassLoader classLoader) {
            hints.reflection()
                    .registerType(WebAuthenticationDetails.class, MemberCategory.values());
            hints.resources().registerResource(new ClassPathResource("GeoLite2-City.mmdb"));
            hints.serialization().registerType(SessionDetails.class);
        }

    }

}
