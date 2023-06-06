package com.example.springadvancedtask2_1.projection;

import com.example.springadvancedtask2_1.entity.Category;
import org.springframework.data.rest.core.config.Projection;

@Projection(types = Category.class)
public interface CustomCategory {
    Category getParentCategory();
}
