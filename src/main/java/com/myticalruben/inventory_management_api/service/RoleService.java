package com.myticalruben.inventory_management_api.service;


import com.myticalruben.inventory_management_api.dto.RoleDTO;
import com.myticalruben.inventory_management_api.entity.Role;
import com.myticalruben.inventory_management_api.mapper.EntityMapper;
import com.myticalruben.inventory_management_api.repository.RoleRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class RoleService {

    @Autowired
    private RoleRepository roleRepository;

    private final EntityMapper mapper =  EntityMapper.INSTANCE;

    @Transactional
    public List<RoleDTO> getAll(){
        List<Role> role = roleRepository.findAll();
        return role.stream()
                .map(mapper::roleToRoleDTO)
                .collect(Collectors.toList());
    }

    public RoleDTO updateRole(Integer id, RoleDTO roleDto){
        Role existRole = roleRepository.findById(id).orElseThrow();
        existRole.setRoleName(roleDto.roleName());

        var role = roleRepository.save(existRole);
        return mapper.roleToRoleDTO(role);
    }

    @Transactional
    public void deleteRoleById(Integer id){
        if(roleRepository.existsById(id)){
           roleRepository.deleteById(id);
        }
    }
}
