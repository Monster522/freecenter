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
public class HibernateSequence extends Model<HibernateSequence> {

    private static final long serialVersionUID = 1L;

    private Long nextVal;


    public Long getNextVal() {
        return nextVal;
    }

    public void setNextVal(Long nextVal) {
        this.nextVal = nextVal;
    }

    @Override
    protected Serializable pkVal() {
        return null;
    }

    @Override
    public String toString() {
        return "HibernateSequence{" +
        "nextVal=" + nextVal +
        "}";
    }
}
