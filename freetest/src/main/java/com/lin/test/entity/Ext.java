package com.lin.test.entity;

import com.baomidou.mybatisplus.extension.activerecord.Model;
import java.io.Serializable;

/**
 * <p>
 * 
 * </p>
 *
 * @author baozang
 * @since 2018-11-06
 */
public class Ext extends Model<Ext> {

    private static final long serialVersionUID = 1L;

    private String id;

    private String sex;

    private String school;


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
    }

    @Override
    protected Serializable pkVal() {
        return this.id;
    }

    @Override
    public String toString() {
        return "Ext{" +
        "id=" + id +
        ", sex=" + sex +
        ", school=" + school +
        "}";
    }
}
