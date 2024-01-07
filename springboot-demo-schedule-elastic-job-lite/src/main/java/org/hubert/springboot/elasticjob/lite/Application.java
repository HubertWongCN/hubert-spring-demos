package org.hubert.springboot.elasticjob.lite;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application {

    public static void main(String[] args) {
        EmbedZookeeperServer.start(6181);
        SpringApplication.run(Application.class, args);
    }

}
