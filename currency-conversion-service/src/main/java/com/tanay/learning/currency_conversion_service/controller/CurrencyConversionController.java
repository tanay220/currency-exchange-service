package com.tanay.learning.currency_conversion_service.controller;

import com.tanay.learning.currency_conversion_service.dto.response.CurrencyConversion;
import com.tanay.learning.currency_conversion_service.proxy.CurrencyExchangeProxy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;

@RestController
public class CurrencyConversionController {

    @Autowired
    private CurrencyExchangeProxy currencyExchangeProxy;

    @GetMapping("/currency-conversion/from/{from}/to/{to}/quantity/{quantity}")
    public CurrencyConversion getCurrencyConversionResponse(@PathVariable String from, @PathVariable String to, @PathVariable BigDecimal quantity) {
        CurrencyConversion currencyConversion = currencyExchangeProxy.retrieveCurrencyExchangeValue(from, to);
        return new CurrencyConversion(currencyConversion.getId(), currencyConversion.getFrom(), currencyConversion.getTo(), currencyConversion.getMultiple(), quantity, quantity.multiply(currencyConversion.getMultiple()), currencyConversion.getEnvironment());
    }
}
