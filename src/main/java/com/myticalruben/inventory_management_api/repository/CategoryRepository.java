package com.myticalruben.inventory_management_api.repository;

import com.myticalruben.inventory_management_api.entity.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Integer> {
}
