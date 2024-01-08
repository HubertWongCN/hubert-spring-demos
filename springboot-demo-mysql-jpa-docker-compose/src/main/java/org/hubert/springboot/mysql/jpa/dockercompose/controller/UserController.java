package org.hubert.springboot.mysql.jpa.dockercompose.controller;

import org.hubert.springboot.mysql.jpa.dockercompose.entity.query.UserQueryBean;
import org.hubert.springboot.mysql.jpa.dockercompose.entity.response.ResponseResult;
import org.hubert.springboot.mysql.jpa.dockercompose.service.UserService;
import org.hubert.springboot.mysql.jpa.dockercompose.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;

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
        if (user.getId() == null || !userService.exists(user.getId())) {
            user.setCreateTime(now);
            user.setUpdateTime(now);
            userService.save(user);
        } else {
            user.setUpdateTime(now);
            userService.update(user);
        }
        return ResponseResult.success(userService.find(user.getId()));
    }

    /**
     * get user
     *
     * @param userId user id
     * @return user
     */
    @GetMapping("get/{userId}")
    public ResponseResult<User> get(@PathVariable("userId") Long userId) {
        return ResponseResult.success(userService.find(userId));
    }

    /**
     * get user list
     *
     * @param pageSize   page size
     * @param pageNumber page number
     * @return user list
     */
    @GetMapping("list")
    public ResponseResult<Page<User>> list(@RequestParam int pageSize, @RequestParam int pageNumber) {
        return ResponseResult.success(userService.findPage(UserQueryBean.builder().build(),
                PageRequest.of(pageNumber, pageSize)));
    }

}
