package org.hubert.springboot.postgre.mybatisplus.controller;


import org.hubert.springboot.postgre.mybatisplus.entity.Role;
import org.hubert.springboot.postgre.mybatisplus.entity.User;
import org.hubert.springboot.postgre.mybatisplus.entity.query.RoleQueryBean;
import org.hubert.springboot.postgre.mybatisplus.entity.response.ResponseResult;
import org.hubert.springboot.postgre.mybatisplus.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;
import java.util.List;

/**
 * @author hubertwong
 */
@RestController
@RequestMapping("/role")
public class RoleController {

    @Autowired
    private RoleService roleService;

    /**
     * @return role list
     */
    @GetMapping("list")
    public ResponseResult<List<Role>> list(RoleQueryBean roleQueryBean) {
        return ResponseResult.success(roleService.findList(roleQueryBean));
    }

    @PostMapping("add")
    public ResponseResult<Role> add(Role role) {
        if (role.getId() == null) {
            role.setCreateTime(LocalDateTime.now());
        }
        role.setUpdateTime(LocalDateTime.now());
        roleService.save(role);
        return ResponseResult.success(roleService.getById(role.getId()));
    }
}
