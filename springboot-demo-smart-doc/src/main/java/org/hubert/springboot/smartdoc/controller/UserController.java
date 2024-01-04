package org.hubert.springboot.smartdoc.controller;

import org.hubert.springboot.smartdoc.entity.ResponseResult;
import org.hubert.springboot.smartdoc.entity.param.UserParam;
import org.hubert.springboot.smartdoc.entity.vo.AddressVo;
import org.hubert.springboot.smartdoc.entity.vo.UserVo;
import org.springframework.web.bind.annotation.*;

import java.util.Collections;
import java.util.List;

/**
 * User API.
 *
 * @author hubertwong
 * @since 1.0
 */
@RestController
@RequestMapping("/user")
public class UserController {

    /**
     * Add user.
     *
     * @param userParam user param
     * @return user
     */
    @PostMapping("add")
    public ResponseResult<String> add(@RequestBody UserParam userParam) {
        return ResponseResult.success("success");
    }

    /**
     * User list.
     *
     * @return user list
     * @since 1.2
     */
    @GetMapping("list")
    public ResponseResult<List<UserVo>> list() {
        List<UserVo> userVoList = Collections.singletonList(UserVo.builder().name("dai").age(18)
                .address(AddressVo.builder().city("SZ").zipcode("10001").build()).build());
        return ResponseResult.success(userVoList);
    }
}
