package org.hubert.springboot.mysql57.jpa.dao;

import org.hubert.springboot.mysql57.jpa.entity.Role;
import org.springframework.stereotype.Repository;

/**
 * @author hubertwong
 */
@Repository
public interface RoleDao extends BaseDao<Role, Long> {
}
