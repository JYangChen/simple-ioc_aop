package com.codull.IOC_AOP.AOP;

/**
 * @program: IOC_AOP
 * @description: SimpleAOP 测试类
 * @author: anthony1314
 * @create: 2020-02-10 00:56
 **/

public class SimpleAOPTest {

    public static void main(String[] args) {
        // 1.创建一个MethodInvocation实现类
        MethodInvocation logTask = () -> System.out.println("log task start");
        HelloServiceImpl helloService = new HelloServiceImpl();

        // 2.创建一个Advice
        Advice beforeAdvice = new BeforeAdvice(helloService, logTask);

        // 3.为目标对象生成代理
        HelloService helloServiceProxy = (HelloService) SimpleAOP.getProxy(helloService, beforeAdvice);
        helloServiceProxy.sayHelloWorld();
    }
}
