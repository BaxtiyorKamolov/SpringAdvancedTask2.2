package com.example.springadvancedtask2_1.repository;

import com.example.springadvancedtask2_1.entity.AbcEntity;
import com.example.springadvancedtask2_1.projection.CustomAbcEntity;
import jakarta.persistence.criteria.CriteriaBuilder;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path = "abcEntity", collectionResourceRel = "list",
        excerptProjection = CustomAbcEntity.class)
public interface AbcEntityRepository extends JpaRepository<AbcEntity, Integer> {
}
