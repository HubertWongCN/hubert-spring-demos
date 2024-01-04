package org.hubert.springboot.mysql57.jpa.service.impl;

import com.github.wenhao.jpa.Specifications;
import org.apache.commons.lang3.StringUtils;
import org.hubert.springboot.mysql57.jpa.dao.BaseDao;
import org.hubert.springboot.mysql57.jpa.dao.RoleDao;
import org.hubert.springboot.mysql57.jpa.entity.Role;
import org.hubert.springboot.mysql57.jpa.entity.query.RoleQueryBean;
import org.hubert.springboot.mysql57.jpa.service.RoleService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Service;

/**
 * @author hubertwong
 */
@Service
public class RoleServiceImpl extends BaseServiceImpl<Role, Long> implements RoleService {
    /**
     * roleDao.
     */
    private final RoleDao roleDao;

    public RoleServiceImpl(final RoleDao roleDao) {
        this.roleDao = roleDao;
    }

    @Override
    public Page<Role> findPage(RoleQueryBean roleQueryBean, PageRequest pageRequest) {
        Specification<Role> specification = Specifications.<Role>and()
                .like(StringUtils.isNotEmpty(roleQueryBean.getName()), "name",
                        roleQueryBean.getName())
                .like(StringUtils.isNotEmpty(roleQueryBean.getDescription()), "description",
                        roleQueryBean.getDescription())
                .build();
        return this.roleDao.findAll(specification, pageRequest);
    }

    @Override
    public BaseDao<Role, Long> getBaseDao() {
        return this.roleDao;
    }
}
