package com.example.springadvancedtask2_1.repository;

import com.example.springadvancedtask2_1.entity.Supplier;
import com.example.springadvancedtask2_1.projection.CustomSupplier;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path = "supplier", collectionResourceRel = "list",
        excerptProjection = CustomSupplier.class)
public interface SupplierRepository extends JpaRepository<Supplier, Integer> {
}
