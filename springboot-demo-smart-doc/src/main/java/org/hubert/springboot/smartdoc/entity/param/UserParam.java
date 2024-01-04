package org.hubert.springboot.smartdoc.entity.param;

import lombok.Builder;
import lombok.Data;

/**
 * @author hubertwong
 */
@Data
@Builder
public class UserParam {

    /**
     * username.
     */
    private String name;

    /**
     * user age.
     */
    private int age;

    /**
     * user address.
     */
    private AddressParam address;
}
