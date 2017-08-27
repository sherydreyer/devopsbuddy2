package com.devopsbuddy2.web.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Sheryl Dreyer on 2017/08/27.
 */
@Controller
public class IndexController {
    @RequestMapping("/")
    public String home() {
        return "index";

    }
}
