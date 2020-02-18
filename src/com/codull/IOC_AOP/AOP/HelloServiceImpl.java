package com.codull.IOC_AOP.AOP;

/**
 * @program: IOC_AOP
 * @description: hello事务接口实现类
 * @author: anthony1314
 * @create: 2020-02-10 00:43
 **/

public class HelloServiceImpl implements HelloService{
    @Override
    public void sayHelloWorld() {
        System.out.println("hello world!");
    }
}
