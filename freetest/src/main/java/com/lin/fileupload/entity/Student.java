package com.lin.fileupload.entity;

/**
 * Created by baozang Cotter on 2018/12/4.
 */
public class Student {
    private String name;

    private String gender;

    private int age;

    private String city;

    public Student(){}

    public Student(String name, String gender, int age, String city){
        this.name = name;
        this.gender = gender;
        this.age = age;
        this.city = city;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }
}
