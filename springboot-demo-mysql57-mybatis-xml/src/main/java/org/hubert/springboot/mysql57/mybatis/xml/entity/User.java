package org.hubert.springboot.mysql57.mybatis.xml.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.time.LocalDateTime;
import java.util.List;

/**
 * @author hubertwong
 */
@Getter
@Setter
@ToString
public class User implements BaseEntity {
    private static final long serialVersionUID = -1596960513109635892L;
    /**
     * user id.
     */
    private Long id;

    /**
     * username.
     */
    private String userName;

    /**
     * user pwd.
     */
    @JsonIgnore
    private String password;

    /**
     * email.
     */
    private String email;

    /**
     * phoneNumber.
     */
    private long phoneNumber;

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

    /**
     * join to role table.
     */
    private List<Role> roles;
}
