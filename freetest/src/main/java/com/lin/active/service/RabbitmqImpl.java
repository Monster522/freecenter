package com.lin.active.service;

import com.lin.active.model.Book;
import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by baozang Cotter on 2018/11/21.
 * function : 信息发送者
 */
@Service
public class RabbitmqImpl {
    @Autowired
    private AmqpTemplate amqpTemplate;

    public void sendMsg(){
        String str1 = "this one";
        amqpTemplate.convertAndSend("amq.topic","topic.message1",str1);
        System.out.println("发送消息1成功");
        String str2 = "this two";
        amqpTemplate.convertAndSend("amq.topic","topic.message2",str2);
        System.out.println("发送消息2成功");
    }

    public void sendAll() {
        for(int i=0;i<=100;i++){
            String str = "this is "+i;
            amqpTemplate.convertAndSend("hello",str+" for send1");
            amqpTemplate.convertAndSend("hello",str+" for send2");
        }
    }

    public void sendBook() {
        Book book = new Book("C++从入门到放弃","zangbao","计算机");
        amqpTemplate.convertAndSend("tranobj",book);
    }
}
