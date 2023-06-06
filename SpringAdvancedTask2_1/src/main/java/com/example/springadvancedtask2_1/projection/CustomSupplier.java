package com.example.springadvancedtask2_1.projection;

import com.example.springadvancedtask2_1.entity.Supplier;
import org.springframework.data.rest.core.config.Projection;

@Projection(types = Supplier.class)
public interface CustomSupplier {
    String getPhoneNumber();
}
