package com.myticalruben.inventory_management_api.repository;

import com.myticalruben.inventory_management_api.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Integer> {
}
