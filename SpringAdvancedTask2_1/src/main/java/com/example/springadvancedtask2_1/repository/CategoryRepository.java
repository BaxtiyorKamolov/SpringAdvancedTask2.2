package com.example.springadvancedtask2_1.repository;

import com.example.springadvancedtask2_1.entity.Category;
import com.example.springadvancedtask2_1.projection.CustomCategory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path = "category", collectionResourceRel = "list",
        excerptProjection = CustomCategory.class)
public interface CategoryRepository extends JpaRepository<Category, Integer> {
}
