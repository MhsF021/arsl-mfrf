package com.time.love.services;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;
import java.time.ZoneId;
import java.time.ZonedDateTime;

import org.springframework.stereotype.Service;

@Service
public class Var {
    public LocalDate dtInicio;
    public LocalDate dtAtual;
    public Period dtTempoTotal;
    public int day;
    public int month;
    public int year;

}