package com.example.springadvancedtask2_1.projection;

import com.example.springadvancedtask2_1.entity.Attachment;
import com.example.springadvancedtask2_1.entity.Category;
import com.example.springadvancedtask2_1.entity.Measurement;
import com.example.springadvancedtask2_1.entity.Product;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
import org.springframework.data.rest.core.config.Projection;

@Projection(types = Product.class)
public interface CustomProduct {
    Category getCategory();

    Attachment getPhoto();

    String getCode();

    Measurement getMeasurement();
}
