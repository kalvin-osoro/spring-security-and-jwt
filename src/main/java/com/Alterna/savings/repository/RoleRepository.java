package com.Alterna.savings.repository;

import com.Alterna.savings.models.ERole;
import com.Alterna.savings.models.Role;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface RoleRepository extends JpaRepository<Role, Long> {
    Optional<Role> findByName(ERole name);
}
