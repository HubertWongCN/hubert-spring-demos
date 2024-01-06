package org.hubert.springboot.postgre.mybatisplus.service;

import com.baomidou.mybatisplus.extension.service.IService;
import org.hubert.springboot.postgre.mybatisplus.entity.Role;
import org.hubert.springboot.postgre.mybatisplus.entity.query.RoleQueryBean;

import java.util.List;

public interface RoleService extends IService<Role> {

    List<Role> findList(RoleQueryBean roleQueryBean);

}
