package com.example.exchangerates.controller;

import com.example.exchangerates.entity.ExchangeRate;
import com.example.exchangerates.service.ExchangeRateService;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
public class ExchangeRateController {

    private final ExchangeRateService service;

    public ExchangeRateController(ExchangeRateService service) {
        this.service = service;
    }

    @GetMapping("/api/rates")
    public List<ExchangeRate> getRates(
            @RequestParam boolean usedb
    ) {
        return service.getRates(usedb);
    }
}