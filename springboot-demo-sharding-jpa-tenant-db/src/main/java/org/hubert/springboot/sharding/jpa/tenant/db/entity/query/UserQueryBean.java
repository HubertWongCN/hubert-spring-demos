package org.hubert.springboot.sharding.jpa.tenant.db.entity.query;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class UserQueryBean {

    private String tenant;

    /**
     * contains name pattern.
     */
    private String name;

    /**
     * contains desc pattern.
     */
    private String description;

}
