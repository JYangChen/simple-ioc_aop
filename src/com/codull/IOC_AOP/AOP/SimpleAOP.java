package com.codull.IOC_AOP.AOP;

import java.lang.reflect.Proxy;

/**
 * @program: IOC_AOP
 * @description: 生成代理类
 * @author: anthony1314
 * @create: 2020-02-10 00:55
 **/

public class SimpleAOP {
    public static Object getProxy(Object bean, Advice advice) {
        return Proxy.newProxyInstance(SimpleAOP.class.getClassLoader(),
                bean.getClass().getInterfaces(), advice);
    }
}
