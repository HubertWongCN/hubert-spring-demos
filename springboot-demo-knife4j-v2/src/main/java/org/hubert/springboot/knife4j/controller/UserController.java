package org.hubert.springboot.knife4j.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import org.hubert.springboot.knife4j.entity.param.UserParam;
import org.hubert.springboot.knife4j.entity.vo.AddressVo;
import org.hubert.springboot.knife4j.entity.vo.UserVo;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Collections;
import java.util.List;

/**
 * @author hubertwong
 */
@Api(value = "User Interfaces", tags = "User Interfaces")
@RestController
@RequestMapping("/user")
public class UserController {
    /**
     * add user
     *
     * @param userParam {@link UserParam}
     * @return user
     */
    @ApiOperation("Add User")
    @ApiImplicitParam(name = "userParam", type = "body", dataTypeClass = UserParam.class, required = true)
    @PostMapping("add")
    public ResponseEntity<String> add(@RequestBody UserParam userParam) {
        return ResponseEntity.ok("success");
    }

    /**
     * list user
     *
     * @return user list
     */
    @ApiOperation("Query User List")
    @GetMapping("list")
    public ResponseEntity<List<UserVo>> list() {
        List<UserVo> userVos = Collections.singletonList(UserVo.builder()
                .name("hubert")
                .age(18)
                .address(AddressVo.builder()
                        .city("GZ")
                        .zipcode("10000")
                        .build())
                .build());
        return ResponseEntity.ok(userVos);
    }
}
