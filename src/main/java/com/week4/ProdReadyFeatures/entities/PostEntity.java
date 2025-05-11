package com.week4.ProdReadyFeatures.entities;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "post")
public class PostEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String title;

    @Column(nullable = false)
    private String description;
}
