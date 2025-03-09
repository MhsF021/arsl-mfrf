package com.time.love.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

import java.time.LocalDate;
import java.time.Period;

@Service
public class LoveServices {

//	private static final LocalDateTime dtInicio = LocalDateTime.of(2024, 05, 24, 0, 0, 0);

	@Autowired
	private Var getVar;

	public void getCalculo(Model model) {
		getVar.dtInicio = LocalDate.of(2024, 6, 12);
		getVar.dtAtual = LocalDate.now();
		getVar.dtTempoTotal = Period.between(getVar.dtInicio, getVar.dtAtual);
		getVar.year = getVar.dtTempoTotal.getYears();
		getVar.month = getVar.dtTempoTotal.getMonths();
		getVar.day = getVar.dtTempoTotal.getDays();

		if (getVar.year == 1) {
			model.addAttribute("anos", getVar.year + " ano,");
		} else {
			model.addAttribute("anos", getVar.year + " anos,");
		}

		if (getVar.month == 1) {
			model.addAttribute("meses", getVar.month + " mês,");
		} else {
			model.addAttribute("meses", getVar.month + " meses,");
		}

		if (getVar.day == 1) {
			model.addAttribute("dias", getVar.day + " dia,");
		} else {
			model.addAttribute("dias", getVar.day + " dias,");
		}

	}
}
