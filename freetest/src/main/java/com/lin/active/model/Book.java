package com.lin.active.model;

import java.io.Serializable;

/**
 * Created by baozang Cotter on 2018/11/20.
 */
public class Book implements Serializable {
    private String title;

    private String author;

    private String cateGory;

    public Book(){}

    public Book(String title, String author,String cateGory) {
        this.title = title;
        this.author = author;
        this.cateGory = cateGory;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getCateGory() {
        return cateGory;
    }

    public void setCateGory(String cateGory) {
        this.cateGory = cateGory;
    }
}
