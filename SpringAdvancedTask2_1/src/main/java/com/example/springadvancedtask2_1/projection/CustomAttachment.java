package com.example.springadvancedtask2_1.projection;

import com.example.springadvancedtask2_1.entity.Attachment;
import org.springframework.data.rest.core.config.Projection;

@Projection(types = Attachment.class)
public interface CustomAttachment {
    Integer getId();

    String getName();

    Long getSize();

    String getContentType();
}
