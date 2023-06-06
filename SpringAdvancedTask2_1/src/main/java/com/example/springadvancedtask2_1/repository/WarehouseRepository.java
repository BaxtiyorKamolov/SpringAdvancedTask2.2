package com.example.springadvancedtask2_1.repository;

import com.example.springadvancedtask2_1.entity.Warehouse;
import com.example.springadvancedtask2_1.projection.CustomWarehouse;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path = "warehouse", collectionResourceRel = "list",
        excerptProjection = CustomWarehouse.class)
public interface WarehouseRepository extends JpaRepository<Warehouse, Integer> {
}
