package org.hubert.springboot.shardingjdbc.jpa.tables.entity.query;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class UserQueryBean {

    /**
     * contains name pattern.
     */
    private String name;

    /**
     * contains desc pattern.
     */
    private String description;

}
