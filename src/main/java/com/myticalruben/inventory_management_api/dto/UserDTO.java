package com.myticalruben.inventory_management_api.dto;

import java.time.Instant;

public record UserDTO(
        Integer id,
        String username,
        String email,
        String password,
        RoleDTO rol,
        Instant created_at
) {}
