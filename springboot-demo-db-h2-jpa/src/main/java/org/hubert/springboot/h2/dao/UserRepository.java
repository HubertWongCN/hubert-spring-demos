package org.hubert.springboot.h2.dao;

import org.hubert.springboot.h2.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @author hubertwong
 */
@Repository
public interface UserRepository extends JpaRepository<User, Integer> {
}
