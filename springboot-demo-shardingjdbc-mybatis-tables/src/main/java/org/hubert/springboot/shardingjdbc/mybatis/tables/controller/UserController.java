package org.hubert.springboot.shardingjdbc.mybatis.tables.controller;


import org.hubert.springboot.shardingjdbc.mybatis.tables.entity.User;
import org.hubert.springboot.shardingjdbc.mybatis.tables.entity.query.UserQueryBean;
import org.hubert.springboot.shardingjdbc.mybatis.tables.entity.response.ResponseResult;
import org.hubert.springboot.shardingjdbc.mybatis.tables.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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
            userService.save(user);
        } else {
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
     * @return user list 2
     */
    @GetMapping("get2/{userId}")
    public ResponseResult<User> get2(@PathVariable("userId") Long userId) {
        return ResponseResult.success(userService.findById2(userId));
    }

    /**
     * @return user list
     */
    @GetMapping("list")
    public ResponseResult<List<User>> list(UserQueryBean userQueryBean) {
        return ResponseResult.success(userService.findList(userQueryBean));
    }

    @PostMapping("delete")
    public ResponseResult<Integer> delete(Long userId) {
        return ResponseResult.success(userService.deleteById(userId));
    }
}
