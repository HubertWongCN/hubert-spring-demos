package org.hubert.springboot.mysql57.mybatis.annotation.entity;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

/**
 * @author hubertwong
 */
@Getter
@Setter
public class Role implements BaseEntity {

    private static final long serialVersionUID = -5355665138021399970L;
    /**
     * role id.
     */
    private Long id;

    /**
     * role name.
     */
    private String name;

    /**
     * role key.
     */
    private String roleKey;

    /**
     * description.
     */
    private String description;

    /**
     * create date time.
     */
    private LocalDateTime createTime;

    /**
     * update date time.
     */
    private LocalDateTime updateTime;

}
