package org.hubert.springboot.smartdoc.controller;

import org.hubert.springboot.smartdoc.entity.ResponseResult;
import org.hubert.springboot.smartdoc.entity.param.AddressParam;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Address API.
 *
 * @author hubertwong
 * @since 1.1
 */
@RestController
@RequestMapping("/address")
public class AddressController {
    /**
     * Add a new address.
     *
     * @param addressParam param
     * @return address
     */
    @PostMapping("add")
    public ResponseResult<String> add(AddressParam addressParam) {
        return ResponseResult.success("success");
    }

}
