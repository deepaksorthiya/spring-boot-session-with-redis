package com.example.mvc;

import jakarta.servlet.http.HttpSession;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ModelAttribute;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.security.Principal;

@ControllerAdvice
public class SecurityControllerAdvise {

    @ModelAttribute("currentUserName")
    String currentUser(Principal principal) throws UnknownHostException {
        return (principal != null) ? principal.getName() + " on Host:: " + InetAddress.getLocalHost().getHostName() : null;
    }

    @ModelAttribute("httpSessionId")
    String sessionId(HttpSession httpSession) {
        return httpSession.getId();
    }

}
