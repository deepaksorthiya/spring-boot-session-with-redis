package com.example.mvc;

import jakarta.servlet.http.HttpSession;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ModelAttribute;

import java.security.Principal;

@ControllerAdvice
public class SecurityControllerAdvise {

    @ModelAttribute("currentUserName")
    String currentUser(Principal principal) {
        return (principal != null) ? principal.getName() : null;
    }

    @ModelAttribute("httpSessionId")
    String sessionId(HttpSession httpSession) {
        return httpSession.getId();
    }

}
