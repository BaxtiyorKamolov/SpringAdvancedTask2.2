package com.example.springadvancedtask2_1.projection;

import com.example.springadvancedtask2_1.entity.Currency;
import com.example.springadvancedtask2_1.entity.Input;
import com.example.springadvancedtask2_1.entity.Supplier;
import com.example.springadvancedtask2_1.entity.Warehouse;
import jakarta.persistence.Column;
import jakarta.persistence.ManyToOne;
import org.springframework.data.rest.core.config.Projection;

import java.sql.Timestamp;

@Projection(types = Input.class)
public interface CustomInput {
    Integer getId();

    Timestamp getDate();

    Warehouse getWarehouse();

    Supplier getSupplier();

    Currency getCurrency();

    String getFactureNumber();

    String getCode();
}
