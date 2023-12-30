package org.hubert.springframework.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.hubert.springframework.aspect.LogAspect;
import org.hubert.springframework.dao.UserDaoImpl;
import org.hubert.springframework.service.UserServiceImpl;

/**
 * @author hubertwong
 */
@EnableAspectJAutoProxy
@Configuration
public class BeansConfig {
    /**
     * @return user dao
     */
    @Bean("userDao")
    public UserDaoImpl userDao() {
        return new UserDaoImpl();
    }

    /**
     * @return user service
     */
    @Bean("userService")
    public UserServiceImpl userService() {
        UserServiceImpl userService = new UserServiceImpl();
        userService.setUserDao(userDao());
        return userService;
    }

    /**
     * @return log aspect
     */
    @Bean("logAspect")
    public LogAspect logAspect() {
        return new LogAspect();
    }
}
