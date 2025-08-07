package com.tanay.learning.currency_exchange_service.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.math.BigDecimal;

@Entity
@Table(name = "currency_exchange")
public class CurrencyExchangeEntity {

    @Id
    private Long id;

    @Column(name = "currency_from")
    private String from;

    @Column(name = "currency_to")
    private String to;

    public Long getId() {
        return id;
    }

    public String getFrom() {
        return from;
    }

    public String getTo() {
        return to;
    }

    public BigDecimal getMultiple() {
        return multiple;
    }

    private BigDecimal multiple;
}
