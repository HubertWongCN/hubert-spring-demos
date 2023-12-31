package org.hubert.springframework.proxy;

import org.hubert.springframework.service.UserService;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @author hubertwong
 */
public class UserLogProxy {
    /**
     * proxy target
     */
    private UserService target;


    public UserLogProxy(UserService target) {
        super();
        this.target = target;
    }

    public UserService getLoggingProxy() {
        UserService proxy;
        ClassLoader loader = target.getClass().getClassLoader();
        Class[] interfaces = {UserService.class};
        InvocationHandler handler = new InvocationHandler() {
            /**
             * @param proxy 代理对象。一般不使用该对象
             * @param method 正在被调用的方法
             * @param args 调用方法传入的参数
             */
            @Override
            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                String methodName = method.getName();
                // log - before method
                System.out.println("[before] execute method: " + methodName);

                // call method
                Object result = null;
                try {
                    // 前置通知
                    result = method.invoke(target, args);
                    // 返回通知，可以访问到方法的返回值
                } catch (NullPointerException e) {
                    e.printStackTrace();
                    // 异常通知，可以访问到方法出现的异常
                }
                // 后置通知。因为方法可能会出现异常，所以访问不到方法的返回值

                // log - after method
                System.out.println("[after] execute method: " + methodName + ", return value: " + result);
                return result;
            }
        };

        /**
         * loader: 代理对象使用的类加载器.
         * interfaces: 指定代理对象的类型. 即代理代理对象中可以有哪些方法.
         * h: 当具体调用代理对象的方法时, 应该如何进行响应, 实际上就是调用 InvocationHandler 的 invoke 方法
         */
        proxy = (UserService) Proxy.newProxyInstance(loader, interfaces, handler);
        return proxy;
    }
}
