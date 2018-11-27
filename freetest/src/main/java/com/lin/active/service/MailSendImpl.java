package com.lin.active.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

/**
 * Created by baozang Cotter on 2018/11/7.
 */
@Service
public class MailSendImpl {

    //邮件服务类JMS
    @Autowired
    private JavaMailSender javaMailSender;

    public String sendMail() {
        //建立邮件消息体
        SimpleMailMessage simpleMailMessage = new SimpleMailMessage();
        //发送者
        simpleMailMessage.setFrom("repairsin@163.com");
        //接收者
        simpleMailMessage.setTo("553588414@qq.com");
        //主题
        simpleMailMessage.setSubject("湖南农业大学开会通知");
        //内容
        simpleMailMessage.setText("你好我是来自福建的林藏宝。这是我的自我介绍。具体会议室为十教南204");

        //发送邮件
        javaMailSender.send(simpleMailMessage);

        return "1";
    }

}
