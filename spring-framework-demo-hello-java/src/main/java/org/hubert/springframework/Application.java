package org.hubert.springframework;

import org.hubert.springframework.config.BeansConfig;
import org.hubert.springframework.entity.User;
import org.hubert.springframework.service.UserServiceImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.List;

/**
 * @author hubertwong
 */
public class Application {
    /**
     * main interfaces
     *
     * @param args args
     */
    public static void main(String[] args) {
        // create and configure beans
        ApplicationContext context =
                new AnnotationConfigApplicationContext(BeansConfig.class);

        // retrieve configured instance
        UserServiceImpl service = context.getBean("userService", UserServiceImpl.class);

        // use configured instance
        List<User> userList = service.findUserList();

        // print info from beans
        userList.forEach(user -> System.out.println(user.getName() + " : " + user.getAge()));
    }
}
