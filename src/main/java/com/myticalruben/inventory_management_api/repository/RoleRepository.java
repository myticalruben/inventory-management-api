package com.myticalruben.inventory_management_api.repository;

import com.myticalruben.inventory_management_api.entity.Role;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleRepository extends JpaRepository<Role, Integer> {
}
