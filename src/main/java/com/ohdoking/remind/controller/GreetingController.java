package com.ohdoking.remind.controller;

import org.mockito.internal.stubbing.answers.ThrowsException;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class GreetingController {

    @RequestMapping("/greeting")
    public String greeting(@RequestParam(value="name", required=false, defaultValue="World") String name, Model model) {
        model.addAttribute("name", name);
        System.out.println("controller");
        return "greeting";
    }
    
    @RequestMapping("/greeting2")
    public String greeting2(@RequestParam(value="name", required=false, defaultValue="World") String name, Model model) throws Exception {
    	
    	throw new Exception("mess");
    }

}