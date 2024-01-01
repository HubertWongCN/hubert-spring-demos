package org.hubert.springboot.banner;

import org.springframework.boot.Banner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
//        SpringApplication application = new SpringApplication(Application.class);
//        /*
//         * Banner.Mode.OFF:关闭;
//         * Banner.Mode.CONSOLE:控制台输出，默认方式;
//         * Banner.Mode.LOG:日志输出方式;
//         */
//        application.setBannerMode(Banner.Mode.OFF); // here
//        application.run(args);
    }

}
