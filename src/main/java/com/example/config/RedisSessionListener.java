package com.example.config;

import lombok.extern.slf4j.Slf4j;
import org.springframework.context.event.EventListener;
import org.springframework.session.events.SessionCreatedEvent;
import org.springframework.session.events.SessionDeletedEvent;
import org.springframework.session.events.SessionDestroyedEvent;
import org.springframework.session.events.SessionExpiredEvent;
import org.springframework.stereotype.Component;

@Component
@Slf4j
public class RedisSessionListener {

    @EventListener
    public void processSessionCreatedEvent(SessionCreatedEvent event) {
        log.info("Session created: {}", event);
    }

    @EventListener
    public void processSessionDeletedEvent(SessionDeletedEvent event) {
        log.info("Session deleted: {}", event);
    }

    @EventListener
    public void processSessionDestroyedEvent(SessionDestroyedEvent event) {
        log.info("Session destroy: {}", event);
    }

    @EventListener
    public void processSessionExpiredEvent(SessionExpiredEvent event) {
        log.info("Session expired: {}", event);
    }

}
