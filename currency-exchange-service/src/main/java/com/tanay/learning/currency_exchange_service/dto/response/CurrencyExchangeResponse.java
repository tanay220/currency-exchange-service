package com.tanay.learning.currency_exchange_service.dto.response;

import java.math.BigDecimal;

public class CurrencyExchangeResponse {
    private String from;
    private String to;

    private BigDecimal multiple;
    private String environment;

    public CurrencyExchangeResponse(String from, String to, BigDecimal multiple, String environment) {
        this.from = from;
        this.to = to;
        this.multiple = multiple;
        this.environment = environment;
    }


    public String getFrom() {
        return from;
    }

    public void setFrom(String from) {
        this.from = from;
    }

    public String getTo() {
        return to;
    }

    public void setTo(String to) {
        this.to = to;
    }

    public BigDecimal getMultiple() {
        return multiple;
    }

    public void setMultiple(BigDecimal multiple) {
        this.multiple = multiple;
    }

    public String getEnvironment() {
        return environment;
    }

    public void setEnvironment(String environment) {
        this.environment = environment;
    }


}
