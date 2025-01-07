package com.example.config;

import com.maxmind.geoip2.DatabaseReader;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.io.InputStream;

@Configuration
public class GeoConfig {

    @Bean
    public DatabaseReader geoDatabaseReader(@Value("classpath:GeoLite2-City.mmdb") InputStream geoInputStream)
            throws Exception {
        return new DatabaseReader.Builder(geoInputStream).build();
    }

}
