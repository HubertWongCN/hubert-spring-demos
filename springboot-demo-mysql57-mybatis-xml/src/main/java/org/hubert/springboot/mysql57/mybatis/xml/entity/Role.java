package org.hubert.springboot.mysql57.mybatis.xml.entity;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.time.LocalDateTime;

/**
 * @author hubertwong
 */
@Getter
@Setter
@ToString
public class Role implements BaseEntity {

    private static final long serialVersionUID = 8939817711417953809L;
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
