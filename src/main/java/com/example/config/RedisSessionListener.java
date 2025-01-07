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
        log.debug("Session created: {}", event);
    }

    @EventListener
    public void processSessionDeletedEvent(SessionDeletedEvent event) {
        log.debug("Session deleted: {}", event);
    }

    @EventListener
    public void processSessionDestroyedEvent(SessionDestroyedEvent event) {
        log.debug("Session destroy: {}", event);
    }

    @EventListener
    public void processSessionExpiredEvent(SessionExpiredEvent event) {
        log.debug("Session expired: {}", event);
    }

}
