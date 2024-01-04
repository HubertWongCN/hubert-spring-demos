package org.hubert.springboot.mysql57.mybatis.annotation.controller;


import org.hubert.springboot.mysql57.mybatis.annotation.entity.Role;
import org.hubert.springboot.mysql57.mybatis.annotation.entity.query.RoleQueryBean;
import org.hubert.springboot.mysql57.mybatis.annotation.entity.response.ResponseResult;
import org.hubert.springboot.mysql57.mybatis.annotation.service.RoleService;
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
     * @return user list
     */
    @GetMapping("list")
    public ResponseResult<List<Role>> list(RoleQueryBean roleQueryBean) {
        return ResponseResult.success(roleService.findList(roleQueryBean));
    }
}
