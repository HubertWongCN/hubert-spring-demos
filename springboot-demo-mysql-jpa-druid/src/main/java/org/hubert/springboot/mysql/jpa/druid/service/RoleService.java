package org.hubert.springboot.mysql.jpa.druid.service;

import org.hubert.springboot.mysql.jpa.druid.entity.Role;
import org.hubert.springboot.mysql.jpa.druid.entity.query.RoleQueryBean;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;

public interface RoleService extends BaseService<Role, Long> {

    /**
     * find page by query.
     *
     * @param roleQueryBean query
     * @param pageRequest   pageRequest
     * @return page
     */
    Page<Role> findPage(RoleQueryBean roleQueryBean, PageRequest pageRequest);

}
