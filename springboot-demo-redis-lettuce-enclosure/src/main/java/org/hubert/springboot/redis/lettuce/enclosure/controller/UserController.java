package org.hubert.springboot.redis.lettuce.enclosure.controller;


import org.hubert.springboot.redis.lettuce.enclosure.entity.User;
import org.hubert.springboot.redis.lettuce.enclosure.entity.response.ResponseResult;
import org.hubert.springboot.redis.lettuce.enclosure.service.RedisService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @author hubertwong
 */
@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private RedisService<User> redisService;

    /**
     * @param user user param
     * @return user
     */
    @PostMapping("add")
    public ResponseResult<User> add(User user) {
        redisService.set(String.valueOf(user.getId()), user);
        return ResponseResult.success(redisService.get(String.valueOf(user.getId())));
    }

    /**
     * @return user list
     */
    @GetMapping("find/{userId}")
    public ResponseResult<User> find(@PathVariable("userId") String userId) {
        return ResponseResult.success(redisService.get(userId));
    }

}
