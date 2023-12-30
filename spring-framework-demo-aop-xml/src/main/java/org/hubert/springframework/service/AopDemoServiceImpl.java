package org.hubert.springframework.service;

/**
 * @author hubertwong
 */
public class AopDemoServiceImpl {
    public void doMethod1() {
        System.out.println("AopDemoServiceImpl.doMethod1()");
    }

    public void doMethod2() {
        System.out.println("AopDemoServiceImpl.doMethod2()");
    }

    public void doMethod3() throws Exception {
        System.out.println("AopDemoServiceImpl.doMethod3()");
        throw new Exception("some exception");
    }
}
