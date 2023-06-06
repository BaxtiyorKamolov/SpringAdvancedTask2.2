package com.example.springadvancedtask2_1.projection;

import com.example.springadvancedtask2_1.entity.AbcEntity;
import org.springframework.data.rest.core.config.Projection;

@Projection(types = AbcEntity.class)
public interface CustomAbcEntity {
    Integer getId();

    String getName();

    Boolean getActive();
}
