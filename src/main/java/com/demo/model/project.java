package com.demo.model;

import java.time.LocalDateTime;
import java.util.Date;

import org.hibernate.annotations.CreationTimestamp;

import jakarta.persistence.Column;

public class project{

    private Long id;
    private String name;
    private String description;

    private Date startDate;
    private Date endDate;
    
    private Long  project_ManagerId; 
    private String status; 

    @Column(name="created_at",updatable = false)
    @CreationTimestamp
    private LocalDateTime createdAt;
}