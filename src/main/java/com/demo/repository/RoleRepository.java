package com.demo.repository;

import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;

import com.demo.model.roles;
public interface RoleRepository extends JpaRepository<roles, Long> {
    Optional<roles> findByRoleName(roles.RoleName roleName);
}
