package org.hubert.springboot.swagger.controller;

import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.hubert.springboot.swagger.entity.param.AddressParam;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Address controller test demo.
 *
 * @author hubertwong
 */
@RestController
@RequestMapping("/address")
public class AddressController {
    /**
     * add address
     *
     * @param addressParam param
     * @return address
     */
    @ApiOperation("Add Address")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "city", type = "query", dataTypeClass = String.class, required = true),
            @ApiImplicitParam(name = "zipcode", type = "query", dataTypeClass = String.class, required = true)
    })
    @PostMapping("add")
    public ResponseEntity<String> add(AddressParam addressParam) {
        return ResponseEntity.ok("success");
    }
}
