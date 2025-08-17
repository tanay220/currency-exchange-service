package com.tanay.learning.currency_conversion_service.proxy;

import com.tanay.learning.currency_conversion_service.dto.response.CurrencyConversion;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "currency-exchange-service")
public interface CurrencyExchangeProxy {


    @GetMapping("/currency-exchange/from/{currencyFrom}/to/{currencyTo}")
    CurrencyConversion retrieveCurrencyExchangeValue(@PathVariable("currencyFrom") String currencyFrom, @PathVariable("currencyTo") String currencyTo);
}
