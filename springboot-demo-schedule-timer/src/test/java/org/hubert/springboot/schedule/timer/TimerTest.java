package org.hubert.springboot.schedule.timer;

import lombok.SneakyThrows;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;

import java.time.LocalDateTime;
import java.util.Timer;
import java.util.TimerTask;

/**
 * @author hubertwong
 */
@Slf4j
public class TimerTest {

    @Test
    @SneakyThrows
    public void timer() {
        // start timer
        Timer timer = new Timer();
        timer.schedule(new TimerTask() {
            public void run() {
                log.info("timer-task @{}", LocalDateTime.now());
            }
        }, 1000);

        // waiting to process(sleep to mock)
        Thread.sleep(3000);

        // stop timer
        timer.cancel();
    }

    @Test
    @SneakyThrows
    public void timerPeriod() {
        // start timer
        Timer timer = new Timer();
        timer.schedule(new TimerTask() {
            @SneakyThrows
            public void run() {
                log.info("timer-period-task @{}", LocalDateTime.now());
                Thread.sleep(100); // 执行时间大于Period间隔时间
            }
        }, 500, 1000);

        // waiting to process(sleep to mock)
        Thread.sleep(10000);

        // stop timer
        timer.cancel();
    }

    @Test
    @SneakyThrows
    public void timerFixedRate() {
        // start timer
        Timer timer = new Timer();
        timer.scheduleAtFixedRate(new TimerTask() {
            int count = 0;

            @SneakyThrows
            public void run() {
                if (count++==2) {
                    Thread.sleep(5000); // 某一次执行时间超过了period(执行周期）
                }
                log.info("timer-fixedRate-task @{}", LocalDateTime.now());

            }
        }, 500, 1000);

        // waiting to process(sleep to mock)
        Thread.sleep(10000);

        // stop timer
        timer.cancel();
    }
}
