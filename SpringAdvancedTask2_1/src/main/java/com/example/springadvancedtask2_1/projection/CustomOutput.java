package com.example.springadvancedtask2_1.projection;

import com.example.springadvancedtask2_1.entity.*;
import jakarta.persistence.Column;
import jakarta.persistence.ManyToOne;
import org.springframework.data.rest.core.config.Projection;

import java.sql.Timestamp;

@Projection(types = Output.class)
public interface CustomOutput {
    Integer getId();

    Timestamp getDate();

    Warehouse getWarehouse();

    Client getClient();

    Supplier getSupplier();

    Currency getCurrency();

    String getFactureNumber();

    String getCode();
}
