package org.hubert.springboot.postgre.jpa.dao;

import org.hubert.springboot.postgre.jpa.entity.User;
import org.springframework.stereotype.Repository;

/**
 * @author hubertwong
 */
@Repository
public interface UserDao extends BaseDao<User, Long> {

}
