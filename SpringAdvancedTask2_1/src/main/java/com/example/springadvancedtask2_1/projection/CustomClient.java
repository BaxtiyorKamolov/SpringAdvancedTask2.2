package com.example.springadvancedtask2_1.projection;

import com.example.springadvancedtask2_1.entity.Client;
import org.springframework.data.rest.core.config.Projection;

@Projection(types = Client.class)
public interface CustomClient {
    String getPhoneNumber();
}
