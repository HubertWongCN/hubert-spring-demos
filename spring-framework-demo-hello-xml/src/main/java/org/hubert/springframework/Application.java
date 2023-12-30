package org.hubert.springframework;

import org.hubert.springframework.entity.User;
import org.hubert.springframework.service.UserServiceImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

/**
 * @author hubertwong
 * @date 2023/12/31 00:07
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
                new ClassPathXmlApplicationContext("aspects.xml", "daos.xml", "services.xml");

        // retrieve configured instance
        UserServiceImpl service = context.getBean("userService", UserServiceImpl.class);

        // use configured instance
        List<User> userList = service.findUserList();

        // print info from beans
        userList.forEach(user -> System.out.println(user.getName() + " : " + user.getAge()));
    }
}
