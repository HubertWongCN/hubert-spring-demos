package org.hubert.springboot.mysql.jpa.druid.dao;

import org.hubert.springboot.mysql.jpa.druid.entity.User;
import org.springframework.stereotype.Repository;

/**
 * @author hubertwong
 */
@Repository
public interface UserDao extends BaseDao<User, Long> {

}
