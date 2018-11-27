package com.lin.active.controller;

import com.lin.active.service.CacheImpl;
import com.lin.active.service.JedisImpl;
import com.lin.active.service.MailSendImpl;
import com.lin.test.entity.Teacher;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;


/**
 * Created by baozang Cotter on 2018/11/7.
 */
@RestController
public class JedisController {
    @Autowired
    private JedisImpl jedisImpl;

    @Autowired
    private MailSendImpl mailSendImpl;

    @Autowired
    private CacheImpl cacheImpl;

    @PostMapping(value = "/jedis/test1")
    public Teacher jedisTest1(String id) {
        System.out.println("hello1");
        System.out.println(id);
        return cacheImpl.getTeacher2(id);
    }

    @PostMapping(value = "/jedis/test2")
    public Teacher jedisTest2(String id) {
        System.out.println("hello2");
        return cacheImpl.getTeacher1(id);
    }

    @GetMapping(value = "/mail/send")
    public String sendMail() {
        System.out.println("--------SEND!----------");
        return mailSendImpl.sendMail();
    }
}
