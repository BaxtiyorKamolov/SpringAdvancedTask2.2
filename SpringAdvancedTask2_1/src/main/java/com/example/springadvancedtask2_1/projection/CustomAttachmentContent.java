package com.example.springadvancedtask2_1.projection;

import com.example.springadvancedtask2_1.entity.Attachment;
import com.example.springadvancedtask2_1.entity.AttachmentContent;
import org.springframework.data.rest.core.config.Projection;

@Projection(types = AttachmentContent.class)
public interface CustomAttachmentContent {
    Integer getId();

    Byte[] getBytes();

    Attachment getAttachment();
}
