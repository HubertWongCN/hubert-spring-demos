package org.hubert.springboot.mysql57.mybatis.xml.service.impl;

import org.hubert.springboot.mysql57.mybatis.xml.dao.RoleDao;
import org.hubert.springboot.mysql57.mybatis.xml.entity.Role;
import org.hubert.springboot.mysql57.mybatis.xml.entity.query.RoleQueryBean;
import org.hubert.springboot.mysql57.mybatis.xml.service.RoleService;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author hubertwong
 */
@Service
public class RoleServiceImpl implements RoleService {
    /**
     * roleDao.
     */
    private final RoleDao roleDao;

    public RoleServiceImpl(final RoleDao roleDao) {
        this.roleDao = roleDao;
    }

    @Override
    public List<Role> findList(RoleQueryBean roleQueryBean) {
        return this.roleDao.findList(roleQueryBean);
    }
}
