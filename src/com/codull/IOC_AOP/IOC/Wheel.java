package com.codull.IOC_AOP.IOC;

/**
 * @program: IOC_AOP
 * @description: 车轮bean
 * @author: anthony1314
 * @create: 2020-02-10 00:28
 **/

public class Wheel {
    private String brand;

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getSpecification() {
        return specification;
    }

    public void setSpecification(String specification) {
        this.specification = specification;
    }

    private String specification;
}
