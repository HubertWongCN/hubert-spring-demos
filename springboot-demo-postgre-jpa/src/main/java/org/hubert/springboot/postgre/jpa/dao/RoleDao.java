package org.hubert.springboot.postgre.jpa.dao;

import org.hubert.springboot.postgre.jpa.entity.Role;
import org.springframework.stereotype.Repository;

/**
 * @author hubertwong
 */
@Repository
public interface RoleDao extends BaseDao<Role, Long> {

}
