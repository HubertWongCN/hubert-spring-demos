package org.hubert.springboot.sharding.jpa.tenant.db.dao;

import org.hubert.springboot.sharding.jpa.tenant.db.entity.User;
import org.springframework.stereotype.Repository;

/**
 * @author hubertwong
 */
@Repository
public interface UserDao extends BaseDao<User, Long> {

}
