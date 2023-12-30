package org.hubert.springframework.service;

import org.springframework.stereotype.Service;

/**
 * cglib proxy
 *
 * @author hubertwong
 */
@Service
public class CglibProxyService {
    public void doMethod1() {
        System.out.println("CglibProxyService.doMethod1");
    }

    public String doMethod2() {
        System.out.println("CglibProxyService.doMethod2");
        return "hello world";
    }

    public void doMethod3() throws Exception {
        System.out.println("CglibProxyService.doMethod3");
        throw new Exception("some exception");
    }
}
