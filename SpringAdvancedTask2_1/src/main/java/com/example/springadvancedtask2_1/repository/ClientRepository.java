package com.example.springadvancedtask2_1.repository;

import com.example.springadvancedtask2_1.entity.Client;
import com.example.springadvancedtask2_1.projection.CustomClient;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path = "client", collectionResourceRel = "list", excerptProjection = CustomClient.class)
public interface ClientRepository extends JpaRepository<Client, Integer> {
}
