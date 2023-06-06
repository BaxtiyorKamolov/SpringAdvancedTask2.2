package com.example.springadvancedtask2_1.projection;

import com.example.springadvancedtask2_1.entity.Warehouse;
import org.springframework.data.rest.core.config.Projection;

@Projection(types = Warehouse.class)
public interface CustomWarehouse {

}
