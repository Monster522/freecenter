package com.lin.test.dao;

import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Map;

/**
 * Created by baozang Cotter on 2018/11/5.
 */
@Mapper
public interface FreeMysqlDao {
    List<Map<String,Object>> queryAll();
}
