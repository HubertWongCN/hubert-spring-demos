package org.hubert.springframework;

import org.hubert.springframework.service.CglibProxyService;
import org.hubert.springframework.service.JdkProxyService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

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
        ApplicationContext context = new AnnotationConfigApplicationContext("org.hubert.springframework");

        // retrieve configured instance
        JdkProxyService service = context.getBean(JdkProxyService.class);

        // use configured instance
        service.doMethod1();
        service.doMethod2();
        try {
            service.doMethod3();
        } catch (Exception e) {
            // e.printStackTrace();
        }

        CglibProxyService cglibProxyService = context.getBean(CglibProxyService.class);
        cglibProxyService.doMethod1();
        cglibProxyService.doMethod2();
        try {
            cglibProxyService.doMethod3();
        } catch (Exception e) {
            // ignore
        }
    }
}
