package com.tanay.learning.currency_exchange_service.repository;

import com.tanay.learning.currency_exchange_service.entity.CurrencyExchangeEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface CurrencyExchangeRepository extends JpaRepository<CurrencyExchangeEntity, Long> {

    Optional<CurrencyExchangeEntity> findByFromAndTo(String from, String tol);
}
