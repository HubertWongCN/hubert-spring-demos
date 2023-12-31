package org.hubert.springframework;

import org.hubert.springframework.proxy.UserLogProxy;
import org.hubert.springframework.service.UserServiceImpl;

/**
 * @author hubertwong
 */
public class ProxyDemo {

    public static void main(String[] args) {
        // proxy
        UserServiceImpl userService = (UserServiceImpl) new UserLogProxy().getUserLogProxy(new UserServiceImpl());

        // call methods
        userService.findUserList();
        userService.addUser();
    }
}
