package com.codull.IOC_AOP.IOC;

/**
 * @program: IOC_AOP
 * @description: 对IOC容器进行测试
 * @author: anthony1314
 * @create: 2020-02-10 00:37
 **/

public class SimpleIOCTest {
    public static void main(String[] args) throws Exception {
        String location = SimpleIOC.class.getClassLoader().getResource("com/codull/IOC_AOP/IOC/ioc.xml").getFile();
        SimpleIOC bf = new SimpleIOC(location);
        Car car = (Car) bf.getBean("car");
        System.out.println(car + " | " + car.getName());
        Wheel wheel = (Wheel) bf.getBean("wheel");
        System.out.println(wheel + " | " + wheel.getBrand());
    }
}
