package org.hubert.springboot.mysql.jpa.hikari.dao;

import org.hubert.springboot.mysql.jpa.hikari.entity.Role;
import org.springframework.stereotype.Repository;

/**
 * @author hubertwong
 */
@Repository
public interface RoleDao extends BaseDao<Role, Long> {

}
