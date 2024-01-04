package org.hubert.springboot.mysql57.mybatisplus.tenant.controller;


import org.hubert.springboot.mysql57.mybatisplus.tenant.entity.User;
import org.hubert.springboot.mysql57.mybatisplus.tenant.entity.query.UserQueryBean;
import org.hubert.springboot.mysql57.mybatisplus.tenant.entity.response.ResponseResult;
import org.hubert.springboot.mysql57.mybatisplus.tenant.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.util.List;


/**
 * @author hubertwong
 */
@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    /**
     * @param user user param
     * @return user
     */
    @PostMapping("add")
    public ResponseResult<User> add(User user) {
        if (user.getId() == null) {
            user.setCreateTime(LocalDateTime.now());
        }
        user.setUpdateTime(LocalDateTime.now());
        userService.save(user);
        return ResponseResult.success(userService.getById(user.getId()));
    }


    /**
     * @return user list
     */
    @GetMapping("edit/{userId}")
    public ResponseResult<User> edit(@PathVariable("userId") Long userId) {
        return ResponseResult.success(userService.getById(userId));
    }

    /**
     * @return user list
     */
    @GetMapping("list")
    public ResponseResult<List<User>> list(UserQueryBean userQueryBean) {
        return ResponseResult.success(userService.findList(userQueryBean));
    }
}
