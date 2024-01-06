package org.hubert.springboot.postgre.mybatisplus.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Getter;
import lombok.Setter;
import org.hubert.springboot.postgre.mybatisplus.config.PgTimestampZTypeHandler;

import java.time.LocalDateTime;
import java.util.List;

/**
 * @author hubertwong
 */
@Getter
@Setter
@TableName(value = "tb_user", autoResultMap = true)
public class User implements BaseEntity {

    /**
     * user id.
     */
    @TableId
    private Long id;

    /**
     * username.
     */
    @TableField("user_name")
    private String userName;

    /**
     * user pwd.
     */
    @TableField("password")
    private String password;

    /**
     * email.
     */
    @TableField("email")
    private String email;

    /**
     * phoneNumber.
     */
    @TableField("phone_number")
    private long phoneNumber;

    /**
     * description.
     */
    @TableField("description")
    private String description;

    /**
     * create date time.
     */
    @TableField(value = "create_time", typeHandler = PgTimestampZTypeHandler.class)
    private LocalDateTime createTime;

    /**
     * update date time.
     */
    @TableField(value = "update_time", typeHandler = PgTimestampZTypeHandler.class)
    private LocalDateTime updateTime;

    /**
     * join to role table.
     */
    @TableField(exist = false)
    private List<Role> roles;

}
