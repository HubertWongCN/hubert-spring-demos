package org.hubert.springboot.mysql57.mybatis.annotation.service;

import org.hubert.springboot.mysql57.mybatis.annotation.entity.Role;
import org.hubert.springboot.mysql57.mybatis.annotation.entity.query.RoleQueryBean;

import java.util.List;

public interface RoleService {

    List<Role> findList(RoleQueryBean roleQueryBean);

}
