package com.codull.IOC_AOP.AOP;

import java.lang.reflect.Method;

/**
 * @program: IOC_AOP
 * @description: 实现了 Advice 接口，是一个前置通知
 * @author: anthony1314
 * @create: 2020-02-10 00:52
 **/

public class BeforeAdvice implements Advice {

    private Object bean;
    private MethodInvocation methodInvocation;
    public BeforeAdvice(Object bean, MethodInvocation methodInvocation) {
        this.bean = bean;
        this.methodInvocation = methodInvocation;
    }


    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        // 在目标方法执行前调用通知
        methodInvocation.invoke();
        return method.invoke(bean, args);
    }
}
