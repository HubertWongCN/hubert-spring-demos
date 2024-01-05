package org.hubert.springboot.shardingjdbc.jpa.tenant.dbhint.dao;

import org.hubert.springboot.shardingjdbc.jpa.tenant.dbhint.entity.Role;
import org.springframework.stereotype.Repository;

/**
 * @author hubertwong
 */
@Repository
public interface RoleDao extends BaseDao<Role, Long> {

}
