package org.hubert.springboot.sharding.jpa.tenant.db.dao;

import org.hubert.springboot.sharding.jpa.tenant.db.entity.Role;
import org.springframework.stereotype.Repository;

/**
 * @author hubertwong
 */
@Repository
public interface RoleDao extends BaseDao<Role, Long> {

}
