package org.hubert.springboot.mysql57.mybatisplus.tenant.controller;


import org.hubert.springboot.mysql57.mybatisplus.tenant.entity.Role;
import org.hubert.springboot.mysql57.mybatisplus.tenant.entity.query.RoleQueryBean;
import org.hubert.springboot.mysql57.mybatisplus.tenant.entity.response.ResponseResult;
import org.hubert.springboot.mysql57.mybatisplus.tenant.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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
}
