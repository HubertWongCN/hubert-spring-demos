package org.hubert.springboot.shardingjdbc.jpa.tables.dao;

import org.hubert.springboot.shardingjdbc.jpa.tables.entity.Role;
import org.springframework.stereotype.Repository;

/**
 * @author hubertwong
 */
@Repository
public interface RoleDao extends BaseDao<Role, Long> {

}
