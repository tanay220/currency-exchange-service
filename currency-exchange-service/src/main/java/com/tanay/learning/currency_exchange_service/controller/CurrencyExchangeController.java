package com.tanay.learning.currency_exchange_service.controller;

import com.tanay.learning.currency_exchange_service.dto.response.CurrencyExchangeResponse;
import com.tanay.learning.currency_exchange_service.service.CurrencyExchangeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CurrencyExchangeController {


    @Autowired
    private CurrencyExchangeService currencyExchangeService;

    @GetMapping("/currency-exchange/from/{currencyFrom}/to/{currencyTo}")
    public CurrencyExchangeResponse retrieveCurrencyExchangeValue(@PathVariable("currencyFrom") String currencyFrom, @PathVariable("currencyTo") String currencyTo) {
        return currencyExchangeService.getCurrencyExchangeDetails(currencyFrom, currencyTo);
    }
}
