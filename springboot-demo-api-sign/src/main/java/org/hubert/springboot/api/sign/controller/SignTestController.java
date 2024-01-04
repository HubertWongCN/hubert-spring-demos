package org.hubert.springboot.api.sign.controller;

import org.hubert.springboot.api.sign.config.response.ResponseResult;
import org.hubert.springboot.api.sign.config.sign.Signature;
import org.hubert.springboot.api.sign.entity.User;
import org.springframework.web.bind.annotation.*;

/**
 * @author hubertwong
 */
@RestController
@RequestMapping("user")
public class SignTestController {

    @Signature
    @PostMapping("test/{id}")
    public ResponseResult<String> myController(@PathVariable String id,
                                               @RequestParam String client,
                                               @RequestBody User user) {
        return ResponseResult.success(String.join(",", id, client, user.toString()));
    }
}
