package org.hubert.springboot.mysql57.jpa.service;

import org.hubert.springboot.mysql57.jpa.entity.User;
import org.hubert.springboot.mysql57.jpa.entity.query.UserQueryBean;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;

/**
 * @author hubertwong
 */
public interface UserService extends BaseService<User, Long> {
    /**
     * find by page
     *
     * @param userQueryBean {@link UserQueryBean}
     * @param pageRequest   {@link PageRequest}
     * @return page
     */
    Page<User> findPage(UserQueryBean userQueryBean, PageRequest pageRequest);
}
