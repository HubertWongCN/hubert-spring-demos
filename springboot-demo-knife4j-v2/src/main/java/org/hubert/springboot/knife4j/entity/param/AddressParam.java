package org.hubert.springboot.knife4j.entity.param;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

/**
 * @author hubertwong
 */
@Data
@Builder
@AllArgsConstructor
@ApiModel("Address")
public class AddressParam {

    @ApiModelProperty("City")
    private String city;

    @ApiModelProperty("Zipcode")
    private String zipcode;
}
