package com.example.springadvancedtask2_1.repository;

import com.example.springadvancedtask2_1.entity.Attachment;
import com.example.springadvancedtask2_1.projection.CustomAttachment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path = "attachment", collectionResourceRel = "list",
        excerptProjection = CustomAttachment.class)
public interface AttachmentRepository extends JpaRepository<Attachment, Integer> {
}
