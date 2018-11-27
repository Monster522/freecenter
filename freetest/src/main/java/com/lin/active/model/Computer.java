package com.lin.active.model;

import java.io.Serializable;

/**
 * Created by baozang Cotter on 2018/11/7.
 */
public class Computer implements Serializable {
    private String brand;

    private String size;

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }
}
