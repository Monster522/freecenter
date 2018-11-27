package com.lin.test.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;

/**
 * <p>
 * 老师信息表
 * </p>
 *
 * @author baozang
 * @since 2018-11-06
 */
public class Teacher extends Model<Teacher> implements Serializable{

    private static final long serialVersionUID = 1L;

    /**
     * 老师编号
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    /**
     * 老师名字
     */
    private String name;

    /**
     * 城市名
     */
    private String city;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    @Override
    protected Serializable pkVal() {
        return this.id;
    }

    @Override
    public String toString() {
        return "Teacher{" +
        "id=" + id +
        ", name=" + name +
        ", city=" + city +
        "}";
    }
}
