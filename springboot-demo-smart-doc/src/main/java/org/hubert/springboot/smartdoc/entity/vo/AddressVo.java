package org.hubert.springboot.smartdoc.entity.vo;

import lombok.Builder;
import lombok.Data;

/**
 * @author hubertwong
 */
@Data
@Builder
public class AddressVo {
    /**
     * city.
     */
    private String city;

    /**
     * zip code.
     */
    private String zipcode;
}
