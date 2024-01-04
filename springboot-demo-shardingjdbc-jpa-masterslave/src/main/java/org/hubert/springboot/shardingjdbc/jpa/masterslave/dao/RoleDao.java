package org.hubert.springboot.shardingjdbc.jpa.masterslave.dao;

import org.hubert.springboot.shardingjdbc.jpa.masterslave.entity.Role;
import org.springframework.stereotype.Repository;

/**
 * @author hubertwong
 */
@Repository
public interface RoleDao extends BaseDao<Role, Long> {

}
