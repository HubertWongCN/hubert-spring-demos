package org.hubert.springboot.mysql57.mybatisplus.xml.service;


import org.hubert.springboot.mysql57.mybatisplus.xml.entity.Role;
import org.hubert.springboot.mysql57.mybatisplus.xml.entity.query.RoleQueryBean;

import java.util.List;

public interface RoleService {

    List<Role> findList(RoleQueryBean roleQueryBean);

}
