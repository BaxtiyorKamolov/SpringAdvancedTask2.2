package com.example.springadvancedtask2_1.repository;

import com.example.springadvancedtask2_1.entity.AttachmentContent;
import com.example.springadvancedtask2_1.projection.CustomAttachmentContent;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path = "attachmentContent", collectionResourceRel = "list",
        excerptProjection = CustomAttachmentContent.class)
public interface AttachmentContentRepository extends JpaRepository<AttachmentContent, Integer> {
}
