package com.example.springadvancedtask2_1.projection;

import com.example.springadvancedtask2_1.entity.Input;
import com.example.springadvancedtask2_1.entity.InputProduct;
import com.example.springadvancedtask2_1.entity.Product;
import jakarta.persistence.Column;
import jakarta.persistence.ManyToOne;
import org.springframework.data.rest.core.config.Projection;

import java.util.Date;

@Projection(types = InputProduct.class)
public interface CustomInputProduct {
    Integer getId();

    Product getProduct();

    Double getAmount();

    Double getPrice();

    Date getExpireDate();

    Input getInput();
}
