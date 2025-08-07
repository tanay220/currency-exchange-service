package com.tanay.learning.currency_exchange_service.service;

import com.tanay.learning.currency_exchange_service.dto.response.CurrencyExchangeResponse;
import com.tanay.learning.currency_exchange_service.entity.CurrencyExchangeEntity;
import com.tanay.learning.currency_exchange_service.repository.CurrencyExchangeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class CurrencyExchangeService {

    @Autowired
    private CurrencyExchangeRepository currencyExchangeRepository;

    @Autowired
    private Environment environment;

    public CurrencyExchangeResponse getCurrencyExchangeDetails(String from, String to) {
        Optional<CurrencyExchangeEntity> optionalCurrencyExchangeEntity = currencyExchangeRepository.findByFromAndTo(from, to);
        if (optionalCurrencyExchangeEntity.isEmpty())
            throw new RuntimeException("Currency exchange details from: " + from + "to: " + to + " not found in DB");
        return new CurrencyExchangeResponse(from, to, optionalCurrencyExchangeEntity.get().getMultiple(), environment.getProperty("local.server.port"));

    }
}
