package org.hubert.springboot.mysql57.mybatis.annotation.service.impl;

import org.hubert.springboot.mysql57.mybatis.annotation.dao.RoleDao;
import org.hubert.springboot.mysql57.mybatis.annotation.entity.Role;
import org.hubert.springboot.mysql57.mybatis.annotation.entity.query.RoleQueryBean;
import org.hubert.springboot.mysql57.mybatis.annotation.service.RoleService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RoleServiceImpl implements RoleService {

    /**
     * roleDao.
     */
    private final RoleDao roleDao;

    /**
     * init.
     *
     * @param roleDao2 role dao
     */
    public RoleServiceImpl(final RoleDao roleDao) {
        this.roleDao = roleDao;
    }

    @Override
    public List<Role> findList(RoleQueryBean roleQueryBean) {
        return roleDao.findList(roleQueryBean);
    }
}
