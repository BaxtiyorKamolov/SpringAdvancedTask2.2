package com.example.springadvancedtask2_1.repository;

import com.example.springadvancedtask2_1.entity.Input;
import com.example.springadvancedtask2_1.projection.CustomInput;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path = "input", collectionResourceRel = "list", excerptProjection = CustomInput.class)
public interface InputRepository extends JpaRepository<Input, Integer> {
}
