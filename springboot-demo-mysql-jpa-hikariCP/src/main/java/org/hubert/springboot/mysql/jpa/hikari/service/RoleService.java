package org.hubert.springboot.mysql.jpa.hikari.service;

import org.hubert.springboot.mysql.jpa.hikari.entity.Role;
import org.hubert.springboot.mysql.jpa.hikari.entity.query.RoleQueryBean;
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
