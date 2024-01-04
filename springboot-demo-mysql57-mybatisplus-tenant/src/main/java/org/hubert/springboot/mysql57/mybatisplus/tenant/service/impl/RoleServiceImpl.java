package org.hubert.springboot.mysql57.mybatisplus.tenant.service.impl;

import com.baomidou.mybatisplus.core.toolkit.StringUtils;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.hubert.springboot.mysql57.mybatisplus.tenant.dao.RoleDao;
import org.hubert.springboot.mysql57.mybatisplus.tenant.entity.Role;
import org.hubert.springboot.mysql57.mybatisplus.tenant.entity.query.RoleQueryBean;
import org.hubert.springboot.mysql57.mybatisplus.tenant.service.RoleService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RoleServiceImpl extends ServiceImpl<RoleDao, Role> implements RoleService {

    @Override
    public List<Role> findList(RoleQueryBean roleQueryBean) {
        return lambdaQuery().like(StringUtils.isNotEmpty(roleQueryBean.getName()), Role::getName, roleQueryBean.getName())
                .like(StringUtils.isNotEmpty(roleQueryBean.getDescription()), Role::getDescription, roleQueryBean.getDescription())
                .like(StringUtils.isNotEmpty(roleQueryBean.getRoleKey()), Role::getRoleKey, roleQueryBean.getRoleKey())
                .list();
    }
}
