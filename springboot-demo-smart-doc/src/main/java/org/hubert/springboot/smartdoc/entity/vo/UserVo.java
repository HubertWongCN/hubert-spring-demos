package org.hubert.springboot.smartdoc.entity.vo;

import lombok.Builder;
import lombok.Data;

/**
 * @author hubertwong
 */
@Data
@Builder
public class UserVo {

    /**
     * username.
     */
    private String name;

    /**
     * user's age.
     */
    private int age;

    /**
     * user's address.
     */
    private AddressVo address;
}
