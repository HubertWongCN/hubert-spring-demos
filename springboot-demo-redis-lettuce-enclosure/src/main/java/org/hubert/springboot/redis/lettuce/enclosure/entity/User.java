package org.hubert.springboot.redis.lettuce.enclosure.entity;

import lombok.Getter;
import lombok.Setter;

/**
 * @author hubertwong
 */
@Getter
@Setter
public class User {

    /**
     * user id.
     */
    private Long id;

    /**
     * username.
     */
    private String userName;

}
