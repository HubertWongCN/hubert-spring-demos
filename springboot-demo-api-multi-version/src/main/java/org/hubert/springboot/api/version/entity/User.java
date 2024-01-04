package org.hubert.springboot.api.version.entity;

import lombok.Builder;
import lombok.Data;

/**
 * @author hubertwong
 */
@Data
@Builder
public class User {
    /**
     * user's name
     */
    private String name;
    /**
     * user's age
     */
    private Integer age;
}
