package org.hubert.springboot.mysql.jpa.dockercompose.entity.query;

import lombok.Builder;
import lombok.Data;

/**
 * @author hubertwong
 */
@Data
@Builder
public class UserQueryBean {
    /**
     * contains name pattern
     */
    private String name;
    /**
     * contains desc pattern
     */
    private String description;
}
