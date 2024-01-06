package org.hubert.springboot.postgre.jpa.service;

import org.hubert.springboot.postgre.jpa.entity.Role;
import org.hubert.springboot.postgre.jpa.entity.query.RoleQueryBean;
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
