package org.hubert.springboot.postgre.jpa.druid.dao;

import org.hubert.springboot.postgre.jpa.druid.entity.User;
import org.springframework.stereotype.Repository;

/**
 * @author localhost
 */
@Repository
public interface UserDao extends BaseDao<User, Long> {

}
