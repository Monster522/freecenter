package com.lin.active.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.ListOperations;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by baozang Cotter on 2018/11/7.
 * function : 操作redis数据库实践
 */
@Service
public class JedisImpl {
    @Autowired
    private StringRedisTemplate stringRedisTemplate;

    /**
     * 操作字符串
     */
    public void operateString() {
        stringRedisTemplate.opsForValue().set("author", "luoliang");
        String value = stringRedisTemplate.opsForValue().get("author");
        System.out.println(value);
    }

    /**
     * Redis List操作，Redis列表是简单的字符串列表，按照插入顺序排序。可以添加一个元素到列表的头部（左边）或者尾部（右边）
     */
    public void operateList() {
        String key = "website";
        ListOperations<String, String> listOperations = stringRedisTemplate.opsForList();
        //从左压入栈
        listOperations.leftPush(key, "Github");
        listOperations.leftPush(key, "CSDN");
        //从右压入栈
        listOperations.rightPush(key, "SegmentFault");
        List<String> list = listOperations.range(key, 0, 2);
        System.out.println(list.toString());
    }

}
