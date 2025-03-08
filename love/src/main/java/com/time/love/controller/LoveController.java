package com.time.love.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.time.love.services.LoveServices;

@Controller
public class LoveController {
	
	@Autowired
    private LoveServices loveService;
	
	@GetMapping("/")
	public String taskStarted(Model model) {
		loveService.getCalculo(model);
        return "index";
    }
}
