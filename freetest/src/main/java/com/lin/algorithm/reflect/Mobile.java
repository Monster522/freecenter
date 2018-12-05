package com.lin.algorithm.reflect;

/**
 * Created by baozang Cotter on 2018/12/4.
 */
public class Mobile {
    private String name;

    private String brand;

    private String corlor;

    public Mobile(){}

    public Mobile(String name, String brand, String corlor){
        this.name = name;
        this.brand = brand;
        this.corlor = corlor;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getCorlor() {
        return corlor;
    }

    public void setCorlor(String corlor) {
        this.corlor = corlor;
    }

    //打印全名
    public String getFullName(String name) throws Exception{
        if(name == null || name.equals("")) {
            throw new Exception("名称为空！");
        }
        String fullName = "The Beautiful Mobile is " + name;
        return fullName;
    }

    //打印对象元素

    @Override
    public String toString() {
        String str = "Name : " + this.name + "\nBrand : "+this.brand+"\nCorlor : "+this.corlor;
        return str;
    }
}
