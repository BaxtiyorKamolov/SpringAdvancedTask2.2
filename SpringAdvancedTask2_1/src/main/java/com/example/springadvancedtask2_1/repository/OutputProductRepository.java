package com.example.springadvancedtask2_1.repository;

import com.example.springadvancedtask2_1.entity.OutputProduct;
import com.example.springadvancedtask2_1.projection.CustomOutputProduct;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path = "outputProduct", collectionResourceRel = "list",
        excerptProjection = CustomOutputProduct.class)
public interface OutputProductRepository extends JpaRepository<OutputProduct, Integer> {
}
