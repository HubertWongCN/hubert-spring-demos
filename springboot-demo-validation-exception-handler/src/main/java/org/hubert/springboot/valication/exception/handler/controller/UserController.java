package org.hubert.springboot.valication.exception.handler.controller;

import lombok.extern.slf4j.Slf4j;
import org.hubert.springboot.valication.exception.handler.param.UserParam;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

/**
 * @author hubertwong
 */
@Slf4j
@RestController
@RequestMapping("/user")
public class UserController {

    /**
     * <a href="http://localhost:8080/user/add">request link</a> .
     *
     * @param userParam user param
     * @return user
     */
    @PostMapping("add")
    public ResponseEntity<UserParam> add(@Valid @RequestBody UserParam userParam) {
        return ResponseEntity.ok(userParam);
    }
}
