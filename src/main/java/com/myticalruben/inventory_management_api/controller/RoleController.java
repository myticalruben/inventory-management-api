package com.myticalruben.inventory_management_api.controller;

import com.myticalruben.inventory_management_api.dto.RoleDTO;
import com.myticalruben.inventory_management_api.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/role")
public class RoleController {

    @Autowired
    private RoleService roleService;

    @GetMapping("/")
    public ResponseEntity<List<RoleDTO>> getAllRole(){
        List<RoleDTO> roles = roleService.getAll();
        return ResponseEntity.ok(roles);
    }

    @PutMapping("/{id}")
    public ResponseEntity<RoleDTO> updateRole(
            @PathVariable Integer id,
            @RequestBody  RoleDTO roleDTO
    ){
        var roleUpdate = roleService.updateRole(id, roleDTO);
        return ResponseEntity.ok(roleUpdate);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteRole(@PathVariable Integer id){
        roleService.deleteRoleById(id);
        return ResponseEntity.noContent().build();
    }
}
