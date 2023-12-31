package org.hubert.springframework.config;

import org.hubert.springframework.enetity.User;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author hubertwong
 */
@Configuration
public class BeanConfig {

    @Bean(name = "user", initMethod = "doInit", destroyMethod = "doDestroy")
    public User create() {
        User user = new User();
        user.setName("hubert");
        user.setAge(18);
        return user;
    }
}
