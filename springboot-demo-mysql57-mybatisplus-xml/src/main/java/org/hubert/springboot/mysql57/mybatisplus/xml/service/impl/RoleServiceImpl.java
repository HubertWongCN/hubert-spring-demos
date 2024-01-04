package org.hubert.springboot.mysql57.mybatisplus.xml.service.impl;

import org.hubert.springboot.mysql57.mybatisplus.xml.dao.RoleDao;
import org.hubert.springboot.mysql57.mybatisplus.xml.entity.Role;
import org.hubert.springboot.mysql57.mybatisplus.xml.entity.query.RoleQueryBean;
import org.hubert.springboot.mysql57.mybatisplus.xml.service.RoleService;
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
    public RoleServiceImpl(final RoleDao roleDao2) {
        this.roleDao = roleDao2;
    }

    @Override
    public List<Role> findList(RoleQueryBean roleQueryBean) {
        return roleDao.findList(roleQueryBean);
    }
}
