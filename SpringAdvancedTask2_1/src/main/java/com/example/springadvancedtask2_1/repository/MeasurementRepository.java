package com.example.springadvancedtask2_1.repository;

import com.example.springadvancedtask2_1.entity.Measurement;
import com.example.springadvancedtask2_1.projection.CustomMeasurement;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path = "measurement", collectionResourceRel = "list",
        excerptProjection = CustomMeasurement.class)
public interface MeasurementRepository extends JpaRepository<Measurement, Integer> {
}
