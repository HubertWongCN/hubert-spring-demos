package org.hubert.springboot.smartdoc.entity.param;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

/**
 * @author hubertwong
 */
@Data
@Builder
@AllArgsConstructor
public class AddressParam {

    /**
     * city.
     */
    private String city;

    /**
     * zip code.
     */
    private String zipcode;
}
