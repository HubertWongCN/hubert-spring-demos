package org.hubert.springboot.mysql.jpa.dockercompose.service;

import org.hubert.springboot.mysql.jpa.dockercompose.entity.Role;
import org.hubert.springboot.mysql.jpa.dockercompose.entity.query.RoleQueryBean;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;

/**
 * @author hubertwong
 */
public interface RoleService extends BaseService<Role, Long> {
    /**
     * find by page
     *
     * @param roleQueryBean {@link  RoleQueryBean}
     * @param pageRequest   {@link  PageRequest}
     * @return page
     */
    Page<Role> findPage(RoleQueryBean roleQueryBean, PageRequest pageRequest);
}
