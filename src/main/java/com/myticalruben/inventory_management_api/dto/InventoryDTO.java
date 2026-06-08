package com.myticalruben.inventory_management_api.dto;

import java.time.Instant;

public record InventoryDTO(
        Integer id,
        ProductDTO product,
        Integer stock,
        Instant updated_at
) {
}
