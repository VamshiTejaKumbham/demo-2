package com.demo.repository;

import com.demo.model.User; 
import java.util.Optional;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
    Optional<User> findByUsername(String username);
    Optional<User> findByEmail(String email);
    Page<User> findAll(Pageable pageable);
    boolean existsByUsername(String username);
    boolean existsByEmail(String email);
}