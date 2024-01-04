package org.hubert.springboot.api.version.controller;

import org.hubert.springboot.api.version.config.version.ApiVersion;
import org.hubert.springboot.api.version.entity.User;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author hubertwong
 */
@RestController
@RequestMapping("api/{v}/user")
public class UserController {

    @RequestMapping("get")
    public User getUser() {
        return User.builder().age(18).name("hubert, default").build();
    }

    @ApiVersion("1.0.0")
    @RequestMapping("get")
    public User getUserV1() {
        return User.builder().age(18).name("hubert, v1.0.0").build();
    }

    @ApiVersion("1.1.0")
    @RequestMapping("get")
    public User getUserV11() {
        return User.builder().age(18).name("hubert, v1.1.0").build();
    }

    @ApiVersion("1.1.2")
    @RequestMapping("get")
    public User getUserV112() {
        return User.builder().age(18).name("hubert, v1.1.2").build();
    }
}
