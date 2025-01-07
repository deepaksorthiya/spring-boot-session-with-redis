package com.example.mvc;

import org.springframework.session.FindByIndexNameSessionRepository;
import org.springframework.session.Session;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.security.Principal;
import java.util.Collection;
import java.util.Set;

@Controller
public class IndexController {

    private final FindByIndexNameSessionRepository<? extends Session> sessions;

    public IndexController(FindByIndexNameSessionRepository<? extends Session> sessions) {
        this.sessions = sessions;
    }

    @RequestMapping("/")
    public String index(Principal principal, Model model) {
        Collection<? extends Session> usersSessions = this.sessions.findByPrincipalName(principal.getName()).values();
        model.addAttribute("sessions", usersSessions);
        return "index";
    }

    @PostMapping("/sessions/{sessionIdToDelete}")
    public String removeSession(Principal principal, @PathVariable String sessionIdToDelete) {
        Set<String> usersSessionIds = this.sessions.findByPrincipalName(principal.getName()).keySet();
        if (usersSessionIds.contains(sessionIdToDelete)) {
            this.sessions.deleteById(sessionIdToDelete);
        }

        return "redirect:/";
    }

}
