package org.hubert.springframework;

import org.hubert.springframework.proxy.UserLogProxy;
import org.hubert.springframework.service.UserService;
import org.hubert.springframework.service.impl.UserServiceImpl;

/**
 * @author hubertwong
 */
public class ProxyDemo {

    public static void main(String[] args) {
        // proxy
        UserService userService = new UserLogProxy(new UserServiceImpl()).getLoggingProxy();

        // call methods
        userService.findUserList();
        userService.addUser();
    }
}
