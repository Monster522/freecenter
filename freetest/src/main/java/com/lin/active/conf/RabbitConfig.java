package com.lin.active.conf;

import org.springframework.amqp.core.Binding;
import org.springframework.amqp.core.BindingBuilder;
import org.springframework.amqp.core.Queue;
import org.springframework.amqp.core.TopicExchange;
import org.springframework.context.annotation.Bean;

/**
 * Created by baozang Cotter on 2018/11/21.
 */
public class RabbitConfig {
    final static String message1 = "topic.message1";
    final static String message2 = "topic.message2";

    @Bean
    public Queue queueMessage1() {
        return new Queue(RabbitConfig.message1);
    }

    @Bean
    public Queue queueMessage2() {
        return new Queue(RabbitConfig.message2);
    }

    //实例化topic交换机
    @Bean
    TopicExchange exchange() {
        return new TopicExchange("amq.topic");
    }

    //绑定消息队列到交换机
    @Bean
    Binding bindingExchangeMessage() {
        System.out.println("绑定队列1");
        return BindingBuilder.bind(queueMessage1()).to(exchange()).with("topic.message1");
    }

    @Bean
    Binding bindingExchangeMessages() {
        System.out.println("绑定队列2");
        return BindingBuilder.bind(queueMessage2()).to(exchange()).with("topic.#");
    }


    @Bean
    public Queue helloQueue() {
        return new Queue("hello");
    }

    @Bean
    public Queue tranQueue() {
        return new Queue("tranobj");
    }
}

