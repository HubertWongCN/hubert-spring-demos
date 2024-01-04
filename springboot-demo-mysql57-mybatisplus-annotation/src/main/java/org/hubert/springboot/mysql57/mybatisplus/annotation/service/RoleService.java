package org.hubert.springboot.mysql57.mybatisplus.annotation.service;

import com.baomidou.mybatisplus.extension.service.IService;
import org.hubert.springboot.mysql57.mybatisplus.annotation.entity.Role;
import org.hubert.springboot.mysql57.mybatisplus.annotation.entity.query.RoleQueryBean;

import java.util.List;

public interface RoleService extends IService<Role> {

    List<Role> findList(RoleQueryBean roleQueryBean);

}
