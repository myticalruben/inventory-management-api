package com.myticalruben.inventory_management_api.repository;

import com.myticalruben.inventory_management_api.entity.Inventory;
import org.springframework.data.jpa.repository.JpaRepository;

public interface InventoryRepository extends JpaRepository<Inventory, Integer> {
}
