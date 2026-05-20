package com.example.exchangerates.service;

import com.example.exchangerates.entity.ExchangeRate;
import com.example.exchangerates.repository.ExchangeRateRepository;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.List;

@Service
public class ExchangeRateService {

    private final ExchangeRateRepository repository;
    private final RestTemplate restTemplate;

    private final String API_URL =
            "https://webapi.developers.erstegroup.com/api/csas/public/sandbox/v2/rates/exchangerates?web-api-key=c52a0682-4806-4903-828f-6cc66508329e";

    public ExchangeRateService(ExchangeRateRepository repository,
                               RestTemplate restTemplate) {
        this.repository = repository;
        this.restTemplate = restTemplate;
    }

    public List<ExchangeRate> getRates(boolean useDb) {

        if (useDb) {
            return repository.findAll();
        }

        ExchangeRate[] ratesArray =
                restTemplate.getForObject(API_URL, ExchangeRate[].class);

        List<ExchangeRate> rates = Arrays.asList(ratesArray);

        repository.saveAll(rates);

        return rates;
    }
}