package org.hubert.springboot.ratelimit.guava.controller;

import lombok.Getter;
import lombok.extern.slf4j.Slf4j;
import org.hubert.springboot.ratelimit.guava.config.ratelimit.RateLimit;
import org.hubert.springboot.ratelimit.guava.config.response.ResponseResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author hubertwong
 */
@Slf4j
@RestController
public class RateLimitTestController {

    @RateLimit
    @GetMapping("/limit")
    public ResponseResult<String> limit() {
        log.info("limit");
        return ResponseResult.success();
    }

    @RateLimit(limit = 5)
    @GetMapping("/limit1")
    public ResponseResult<String> limit1() {
        log.info("limit1");
        return ResponseResult.success();
    }

    @GetMapping("nolimit")
    public ResponseResult<String> noRateLimiter() {
        log.info("no limit");
        return ResponseResult.success();
    }
}
