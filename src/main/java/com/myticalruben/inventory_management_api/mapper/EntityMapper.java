package com.myticalruben.inventory_management_api.mapper;

import com.myticalruben.inventory_management_api.dto.CategoryDTO;
import com.myticalruben.inventory_management_api.dto.RoleDTO;
import com.myticalruben.inventory_management_api.entity.Role;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Mapper
public interface EntityMapper {

    EntityMapper INSTANCE = Mappers.getMapper(EntityMapper.class);

    RoleDTO roleToRoleDTO(Role role);
    Role roleDtoToRole(RoleDTO roleDTO);
}
