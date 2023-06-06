package com.example.springadvancedtask2_1.projection;

import com.example.springadvancedtask2_1.entity.Measurement;
import org.springframework.data.rest.core.config.Projection;

@Projection(types = Measurement.class)
public interface CustomMeasurement {

}
