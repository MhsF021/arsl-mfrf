package com.time.love.services;

import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

import java.time.Duration;
import java.time.LocalDateTime;

@Service
public class LoveServices {
	
	private static final LocalDateTime dtInicio = LocalDateTime.of(2024, 05, 24, 0, 0, 0);
	
	public void getCalculo(Model model) {
        LocalDateTime dtAtual = LocalDateTime.now();
        Duration dtTempoTotal = Duration.between(dtInicio, dtAtual);
        
        model.addAttribute("anos", dtTempoTotal.toDays() / 365);
        model.addAttribute("meses", (dtTempoTotal.toDays() % 365) / 30);
        model.addAttribute("dias", (dtTempoTotal.toDays() % 365) % 30);
    }
}
