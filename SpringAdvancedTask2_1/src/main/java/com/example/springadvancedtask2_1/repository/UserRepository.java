package com.example.springadvancedtask2_1.repository;

import com.example.springadvancedtask2_1.entity.User;
import com.example.springadvancedtask2_1.projection.CustomUser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path = "user", collectionResourceRel = "list", excerptProjection = CustomUser.class)
public interface UserRepository extends JpaRepository<User, Integer> {
}
