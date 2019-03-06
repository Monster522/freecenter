package com.lin;

import de.codecentric.boot.admin.server.config.EnableAdminServer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;

import javax.servlet.http.HttpServlet;

/**
 * Created by Enzo Cotter on 2018/10/31.
 */
@SpringBootApplication
//@EnableCaching    //开启缓存
//@EnableScheduling //开启定时任务
@Configuration
@EnableAdminServer
public class FreeApplication {

    public static void main(String[] args){
        SpringApplication.run(FreeApplication.class);
    }
}
