package org.hubert.springframework.service.impl;

import org.hubert.springframework.service.JdkProxyService;
import org.springframework.stereotype.Service;

/**
 * @author hubertwong
 */
@Service
public class JdkProxyServiceImpl implements JdkProxyService {
    @Override
    public void doMethod1() {
        System.out.println("JdkProxyServiceImpl doMethod1");
    }

    @Override
    public String doMethod2() {
        System.out.println("JdkProxyServiceImpl doMethod2");
        return "hello world";
    }

    @Override
    public void doMethod3() throws Exception {
        System.out.println("JdkProxyServiceImpl doMethod3");
        throw new Exception("some exception");
    }
}
