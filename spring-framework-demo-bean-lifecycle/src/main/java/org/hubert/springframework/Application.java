package org.hubert.springframework;

import lombok.extern.slf4j.Slf4j;
import org.hubert.springframework.enetity.User;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author hubertwong
 */
@Slf4j
public class Application {
    /**
     * main interface
     *
     * @param args args
     */
    public static void main(String[] args) {
        log.info("Init application context");
        // create and configure beans
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext("org.hubert.springframework");

        // retrieve configuration instance
        User user = (User) context.getBean("user");

        // print info from beans
        log.info(user.toString());

        log.info("Shutdown application context");
        context.registerShutdownHook();
    }
}
