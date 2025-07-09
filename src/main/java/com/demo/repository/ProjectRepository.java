package com.demo.repository;
import java.util.Optional;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import com.demo.model.project;

public interface ProjectRepository extends JpaRepository<project, Long> {
    Optional<project> findByName(String name);
    Optional<project> findByProjectManager_Id(Long projectManagerId);
Page<project> findAll(Pageable pageable);
Page<project> findByNameContainingIgnoreCase(String name, Pageable pageable);
Page<project> findAllByOrderByCreatedAtAsc(Pageable pageable);
}
