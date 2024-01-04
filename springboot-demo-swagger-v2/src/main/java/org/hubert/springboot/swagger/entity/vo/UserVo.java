package org.hubert.springboot.swagger.entity.vo;

import lombok.Builder;
import lombok.Data;

/**
 * @author hubertwong
 */
@Data
@Builder
public class UserVo {

    private String name;

    private int age;

    private AddressVo address;
}
