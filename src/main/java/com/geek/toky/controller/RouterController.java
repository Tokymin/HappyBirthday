package com.geek.toky.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/")
public class RouterController {

    @RequestMapping(value = "login", method = RequestMethod.GET)
    public String login() {
        return "login.html";
    }

    @RequestMapping(value = "manage", method = RequestMethod.GET)
    public String manage() {
        return "manage.html";
    }

    @RequestMapping(value = "", method = RequestMethod.GET)
    public String index() {
        return "index.html";
    }

    @RequestMapping(value = "register", method = RequestMethod.GET)
    public String register() {
        return "register.html";
    }

    @RequestMapping(value = "stomp", method = RequestMethod.GET)
    public String stomp() {
        return "stomp.html";
    }

}
