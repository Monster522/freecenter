package com.lin.active.service;

import com.lin.active.model.Book;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

/**
 * Created by baozang Cotter on 2018/11/21.
 * function : 信息接收，消费者
 */
@Component
public class RabbitmqClient {
    @RabbitListener(queues="topic.message1")
    public void msg1(String hello){
        System.out.println("Reciever 1: "+hello);
    }

    @RabbitListener(queues="topic.message2")
    public void msg2(String hello){
        System.out.println("Reciever 2: "+hello);
    }

    @RabbitListener(queues="hello")
    public void process1(String hello){
        System.out.println("Reciever 1: "+hello);
    }

    @RabbitListener(queues="hello")
    public void process2(String hello){
        System.out.println("Reciever 2: "+hello);
    }

    @RabbitListener(queues = "tranobj")
    public void getObj(Book book){
        System.out.println(book.getAuthor());
        System.out.println(book.getTitle());
        System.out.println(book.getCateGory());
    }
}
