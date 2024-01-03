package org.hubert.springboot.validation.group.controller;

import lombok.extern.slf4j.Slf4j;
import org.hubert.springboot.validation.group.param.UserParam;
import org.hubert.springboot.validation.group.validation.group.AddValidationGroup;
import org.hubert.springboot.validation.group.validation.group.EditValidationGroup;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

/**
 * @author hubertwong
 */
@Slf4j
@RestController
@RequestMapping("/user")
public class UserController {

    /**
     * add user
     *
     * @param userParam user param
     * @return user
     */
    @PutMapping("add")
    public ResponseEntity<UserParam> add(@Validated(AddValidationGroup.class) @RequestBody UserParam userParam) {
        return ResponseEntity.ok(userParam);
    }

    /**
     * edit user
     *
     * @param userParam user param
     * @return user
     */
    @PostMapping("edit")
    public ResponseEntity<UserParam> edit(@Validated(EditValidationGroup.class) @RequestBody UserParam userParam) {
        return ResponseEntity.ok(userParam);
    }
}
