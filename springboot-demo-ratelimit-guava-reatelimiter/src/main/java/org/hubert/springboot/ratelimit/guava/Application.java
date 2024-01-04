package org.hubert.springboot.ratelimit.guava;

import lombok.SneakyThrows;
import org.hubert.springboot.ratelimit.guava.config.response.ResponseResult;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.client.RestTemplate;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.stream.IntStream;

@SpringBootApplication
public class Application {

    @SneakyThrows
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);

        RestTemplate restTemplate = new RestTemplate();
        restTemplate.getForObject("http://localhost:8080/limit1", ResponseResult.class);

        Thread.sleep(1000);

        // test
        test(20);
    }

    @SneakyThrows
    public static void test(int clientSize) {
        CountDownLatch downLatch = new CountDownLatch(clientSize);
        ExecutorService fixedThreadPool = Executors.newFixedThreadPool(clientSize);
        IntStream.range(0, clientSize).forEach(i ->
                fixedThreadPool.submit(() -> {
                    RestTemplate restTemplate = new RestTemplate();
                    restTemplate.getForObject("http://localhost:8080/limit1", ResponseResult.class);
                    downLatch.countDown();
                })
        );
        downLatch.await();
        fixedThreadPool.shutdown();
    }

}
