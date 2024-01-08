package org.hubert.springboot.mysql.jpa.dockercompose.dao;

import org.hubert.springboot.mysql.jpa.dockercompose.entity.Role;
import org.springframework.stereotype.Repository;

/**
 * @author hubertwong
 */
@Repository
public interface RoleDao extends BaseDao<Role, Long> {
}
