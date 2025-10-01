package com.igt.pay.dfsvc.common.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class RouteController {

    // Need to configure your server to always serve index.html for unknown routes, so React can handle routing.
    // Inace ne radi jer je static...

    @RequestMapping(value = "/{path:[^\\.]*}")
    public String redirect() {
        return "forward:/index.html";
    }
}