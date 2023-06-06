package com.example.springadvancedtask2_1.projection;

import com.example.springadvancedtask2_1.entity.Currency;
import org.springframework.data.rest.core.config.Projection;

@Projection(types = Currency.class)
public interface CustomCurrency {

}
