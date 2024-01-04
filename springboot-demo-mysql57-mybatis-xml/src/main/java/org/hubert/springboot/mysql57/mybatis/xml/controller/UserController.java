package org.hubert.springboot.mysql57.mybatis.xml.controller;

import org.hubert.springboot.mysql57.mybatis.xml.entity.User;
import org.hubert.springboot.mysql57.mybatis.xml.entity.query.UserQueryBean;
import org.hubert.springboot.mysql57.mybatis.xml.entity.response.ResponseResult;
import org.hubert.springboot.mysql57.mybatis.xml.service.UserService;
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
     * add user
     *
     * @param user {@link User}
     * @return {@link User}
     */
    @PutMapping("add")
    public ResponseResult<User> add(User user) {
        LocalDateTime now = LocalDateTime.now();
        if (user.getId() == null) {
            user.setCreateTime(now);
            user.setUpdateTime(now);
            userService.save(user);
        } else {
            user.setUpdateTime(now);
            userService.update(user);
        }
        return ResponseResult.success(userService.findById(user.getId()));
    }

    /**
     * get user
     *
     * @param userId user id
     * @return user
     */
    @GetMapping("get/{userId}")
    public ResponseResult<User> get(@PathVariable("userId") Long userId) {
        return ResponseResult.success(userService.findById(userId));
    }

    /**
     * get user list
     *
     * @param userQueryBean {@link UserQueryBean}
     * @return user list
     */
    @GetMapping("list")
    public ResponseResult<List<User>> list(UserQueryBean userQueryBean) {
        return ResponseResult.success(userService.findList(userQueryBean));
    }

}
