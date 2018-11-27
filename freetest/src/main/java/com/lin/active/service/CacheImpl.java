package com.lin.active.service;

import com.baomidou.mybatisplus.core.conditions.Condition;
import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.lin.test.dao.TeacherDao;
import com.lin.test.entity.Teacher;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheConfig;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;



/**
 * Created by baozang Cotter on 2018/11/7.
 * function : 缓存功能
 */
@CacheConfig(cacheNames = "tea")
@Service
public class CacheImpl {
    @Autowired
    private TeacherDao teacherDao;


    @CachePut(value = "cache1" , key = "#result.id")
    public Teacher getTeacher1(String id) {
        System.out.println("-----------查询开始！--------------");
        QueryWrapper queryWrapper = new QueryWrapper();
        queryWrapper.apply(" id = 1 ");
        Teacher teacher = teacherDao.selectOne(queryWrapper);
        return teacher;
    }

    @Cacheable(value = "cache1" , key = "#id")
    public Teacher getTeacher2(String id) {
        System.out.println("-----------查询开始！--------------");
        QueryWrapper queryWrapper = new QueryWrapper();
        queryWrapper.apply(" id = 1");
        Teacher teacher = teacherDao.selectOne(queryWrapper);
        return teacher;
    }

}
