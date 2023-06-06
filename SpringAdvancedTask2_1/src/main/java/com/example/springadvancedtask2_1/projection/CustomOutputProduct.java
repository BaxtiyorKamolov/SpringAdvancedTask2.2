package com.example.springadvancedtask2_1.projection;

import com.example.springadvancedtask2_1.entity.Output;
import com.example.springadvancedtask2_1.entity.OutputProduct;
import com.example.springadvancedtask2_1.entity.Product;
import jakarta.persistence.Column;
import jakarta.persistence.ManyToOne;
import org.springframework.data.rest.core.config.Projection;

@Projection(types = OutputProduct.class)
public interface CustomOutputProduct {
    Integer getId();

    Product getProduct();

    Double getAmount();

    Double getPrice();

    Output getOutput();
}
