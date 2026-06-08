package com.myticalruben.inventory_management_api.dto;

import java.math.BigDecimal;
import java.time.Instant;

public record ProductDTO(
        Integer id,
        String name,
        String description,
        String sku,
        BigDecimal price,
        CategoryDTO caterory,
        Instant create_at
) { }
