package org.hubert.springboot.mysql.jpa.druid.dao;

import org.hubert.springboot.mysql.jpa.druid.entity.Role;
import org.springframework.stereotype.Repository;

/**
 * @author hubertwong
 */
@Repository
public interface RoleDao extends BaseDao<Role, Long> {

}
