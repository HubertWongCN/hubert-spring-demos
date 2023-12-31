package org.hubert.springboot.mysql57.mybatisplus.gencode.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * <p>
 * 
 * </p>
 *
 * @author hubertwong
 * @since 2024-01-05
 */
@TableName("tb_user_role")
@ApiModel(value = "TbUserRole对象", description = "")
public class TbUserRole implements Serializable {

    private static final long serialVersionUID = 1L;

    private Integer userId;

    private Integer roleId;


    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getRoleId() {
        return roleId;
    }

    public void setRoleId(Integer roleId) {
        this.roleId = roleId;
    }

    @Override
    public String toString() {
        return "TbUserRole{" +
        "userId=" + userId +
        ", roleId=" + roleId +
        "}";
    }
}
