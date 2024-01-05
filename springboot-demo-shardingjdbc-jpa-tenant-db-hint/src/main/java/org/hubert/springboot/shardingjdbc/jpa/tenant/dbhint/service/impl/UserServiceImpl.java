package org.hubert.springboot.shardingjdbc.jpa.tenant.dbhint.service.impl;


import com.github.wenhao.jpa.Specifications;
import org.apache.commons.lang3.StringUtils;
import org.hubert.springboot.shardingjdbc.jpa.tenant.dbhint.dao.BaseDao;
import org.hubert.springboot.shardingjdbc.jpa.tenant.dbhint.dao.UserDao;
import org.hubert.springboot.shardingjdbc.jpa.tenant.dbhint.entity.User;
import org.hubert.springboot.shardingjdbc.jpa.tenant.dbhint.entity.query.UserQueryBean;
import org.hubert.springboot.shardingjdbc.jpa.tenant.dbhint.service.UserService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl extends BaseServiceImpl<User, Long> implements UserService {

    /**
     * userDao.
     */
    private final UserDao userDao;

    /**
     * init.
     *
     * @param userDao user dao
     */
    public UserServiceImpl(final UserDao userDao) {
        this.userDao = userDao;
    }

    /**
     * @return base dao
     */
    @Override
    public BaseDao<User, Long> getBaseDao() {
        return this.userDao;
    }

    /**
     * find by page.
     *
     * @param queryBean   query
     * @param pageRequest pageRequest
     * @return page
     */
    @Override
    public Page<User> findPage(UserQueryBean queryBean, PageRequest pageRequest) {
        Specification<User> specification = Specifications.<User>and()
                .like(StringUtils.isNotEmpty(queryBean.getName()), "user_name", queryBean.getName())
                .like(StringUtils.isNotEmpty(queryBean.getDescription()), "description",
                        queryBean.getDescription())
                .build();
        return this.getBaseDao().findAll(specification, pageRequest);
    }

}
