package com.lin.test.service;

import com.baomidou.mybatisplus.core.conditions.Condition;
import com.lin.test.dao.FreeMysqlDao;
import com.lin.test.dao.UserDao;
import com.lin.test.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;


/**
 * Created by baozang Cotter on 2018/11/5.
 */
@Service
public class FreeServiceImpl {

    @Autowired
    private FreeMysqlDao freeMysqlDao;

    @Autowired
    private UserDao userDao;

    public void user() {
        //实体类操作数据库
        User user = new User();
        user.setId(null);
        user.setUserName("zhangguorong");
        user.setEmail("45678");
        user.setFemale("nn");
        user.setPassWord("0908");
        user.insert();

        //Service操作数据库
        List<User> list = userDao.selectList(Condition.<User>create());



    }

    public void free() {
        List<Map<String,Object>> list = freeMysqlDao.queryAll();
        System.out.println(list.toString());
    }




}
