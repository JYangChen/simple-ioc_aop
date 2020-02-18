package com.codull.IOC_AOP.IOC;

/**
 * @program: IOC_AOP
 * @description: IOC 测试使用的 bean
 * @author: anthony1314
 * @create: 2020-02-02 17:19
 **/

public class Car {
    private String name;
    private String length;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLength() {
        return length;
    }

    public void setLength(String length) {
        this.length = length;
    }

    public String getWidth() {
        return width;
    }

    public void setWidth(String width) {
        this.width = width;
    }

    public String getHeight() {
        return height;
    }

    public void setHeight(String height) {
        this.height = height;
    }

    public Wheel getWheel() {
        return wheel;
    }

    public void setWheel(Wheel wheel) {
        this.wheel = wheel;
    }

    private String width;
    private String height;
    private Wheel wheel;
}
