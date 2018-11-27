package com.lin.active.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by baozang Cotter on 2018/11/7.
 */
@Service
public class TaskOnTime {
    private static Logger logger = LoggerFactory.getLogger(TaskOnTime.class);

    //每12s运行一次
//    @Scheduled(cron="*/15 * * * * ?")
    public void timerToNow(){
        logger.info("打印当前时间：");
        System.out.println("now time:" +
                        new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date()));
    }

}
