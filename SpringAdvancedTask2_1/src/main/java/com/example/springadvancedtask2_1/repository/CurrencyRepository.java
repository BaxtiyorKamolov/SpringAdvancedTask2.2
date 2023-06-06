package com.example.springadvancedtask2_1.repository;

import com.example.springadvancedtask2_1.entity.Currency;
import com.example.springadvancedtask2_1.projection.CustomCurrency;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path = "currency", collectionResourceRel = "list",
        excerptProjection = CustomCurrency.class)
public interface CurrencyRepository extends JpaRepository<Currency, Integer> {
}
