package org.hubert.springboot.postgre.mybatisplus.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Getter;
import lombok.Setter;
import org.hubert.springboot.postgre.mybatisplus.config.PgTimestampZTypeHandler;

import java.time.LocalDateTime;

/**
 * @author hubertwong
 */
@Getter
@Setter
@TableName("tb_role")
public class Role implements BaseEntity {

    /**
     * role id.
     */
    @TableId
    private Long id;

    /**
     * role name.
     */
    @TableField("name")
    private String name;

    /**
     * role key.
     */
    @TableField("role_key")
    private String roleKey;

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

}
