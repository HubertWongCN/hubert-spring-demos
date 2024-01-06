package org.hubert.springboot.postgre.jpa.druid.dao;

import org.hubert.springboot.postgre.jpa.druid.entity.Role;
import org.springframework.stereotype.Repository;

/**
 * @author localhost
 */
@Repository
public interface RoleDao extends BaseDao<Role, Long> {

}
