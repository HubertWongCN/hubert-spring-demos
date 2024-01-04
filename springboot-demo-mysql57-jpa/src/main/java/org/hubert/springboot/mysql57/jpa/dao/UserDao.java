package org.hubert.springboot.mysql57.jpa.dao;

import org.hubert.springboot.mysql57.jpa.entity.User;
import org.springframework.stereotype.Repository;

/**
 * @author hubertwong
 */
@Repository
public interface UserDao extends BaseDao<User, Long> {
}
