package org.hubert.springboot.knife4j.entity.param;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Builder;
import lombok.Data;

/**
 * user.
 *
 * @author hubertwong
 */
@Data
@Builder
@ApiModel(value = "User", subTypes = {AddressParam.class})
public class UserParam {

    @ApiModelProperty("Name")
    private String name;

    @ApiModelProperty("Age")
    private int age;

    @ApiModelProperty("Address")
    private AddressParam address;
}
