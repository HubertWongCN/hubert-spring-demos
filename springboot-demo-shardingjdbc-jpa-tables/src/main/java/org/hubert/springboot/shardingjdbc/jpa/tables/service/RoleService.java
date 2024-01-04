package org.hubert.springboot.shardingjdbc.jpa.tables.service;

import org.hubert.springboot.shardingjdbc.jpa.tables.entity.Role;
import org.hubert.springboot.shardingjdbc.jpa.tables.entity.query.RoleQueryBean;
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
