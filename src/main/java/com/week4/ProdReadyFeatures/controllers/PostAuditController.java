package com.week4.ProdReadyFeatures.controllers;

import com.week4.ProdReadyFeatures.entities.PostEntity;
import jakarta.persistence.EntityManagerFactory;
import org.hibernate.envers.AuditReader;
import org.hibernate.envers.AuditReaderFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping(path = "/audit")
public class PostAuditController {

    @Autowired
    private EntityManagerFactory entityManagerFactory;

    //small api for admin to access all the revision for a particular post
    @GetMapping(path = "/post/{postId}")
    List<PostEntity> getPostRevisions(@PathVariable Long postId){
        AuditReader auditReader = AuditReaderFactory.get(entityManagerFactory.createEntityManager());

        List<Number> revisions = auditReader.getRevisions(PostEntity.class, postId);
        return revisions.stream()
                .map(revisionNumber -> auditReader.find(PostEntity.class, postId, revisionNumber))
                .collect(Collectors.toList());
    }
}
