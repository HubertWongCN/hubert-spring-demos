package org.hubert.springboot.mysql57.mybatisplus.xml.controller;


import org.hubert.springboot.mysql57.mybatisplus.xml.entity.User;
import org.hubert.springboot.mysql57.mybatisplus.xml.entity.query.UserQueryBean;
import org.hubert.springboot.mysql57.mybatisplus.xml.entity.response.ResponseResult;
import org.hubert.springboot.mysql57.mybatisplus.xml.service.UserService;
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
            user.setUpdateTime(LocalDateTime.now());
            userService.save(user);
        } else {
            user.setUpdateTime(LocalDateTime.now());
            userService.update(user);
        }
        return ResponseResult.success(userService.findById(user.getId()));
    }


    /**
     * @return user list
     */
    @GetMapping("get/{userId}")
    public ResponseResult<User> get(@PathVariable("userId") Long userId) {
        return ResponseResult.success(userService.findById(userId));
    }

    /**
     * @return user list
     */
    @GetMapping("list")
    public ResponseResult<List<User>> list(UserQueryBean userQueryBean) {
        return ResponseResult.success(userService.findList(userQueryBean));
    }
}
