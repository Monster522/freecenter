package com.lin.test.conf;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;

/**
 * Created by baozang Cotter on 2018/11/5.
 */
@Configuration
public class FreeConfig {
    @Autowired
    private DruidDataSourceProperties properties;

    private void init() {
        System.out.println("-----------------配置初始化----------------------");
        System.out.println(properties.getUsername());
        System.out.println(properties.getPassword());
    }
}
