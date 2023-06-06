package com.example.springadvancedtask2_1.repository;

import com.example.springadvancedtask2_1.entity.InputProduct;
import com.example.springadvancedtask2_1.projection.CustomInputProduct;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path = "inputProduct", collectionResourceRel = "list",
        excerptProjection = CustomInputProduct.class)
public interface InputProductRepository extends JpaRepository<InputProduct, Integer> {
}
