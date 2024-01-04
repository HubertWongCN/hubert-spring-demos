package org.hubert.springboot.swagger.entity.vo;

import lombok.Builder;
import lombok.Data;

/**
 * @author hubertwong
 */
@Data
@Builder
public class AddressVo {

    private String city;

    private String zipcode;
}
