package org.hubert.springboot.mysql57.jpa.entity.query;

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
