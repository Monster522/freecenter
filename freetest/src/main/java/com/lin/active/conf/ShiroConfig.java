package com.lin.active.conf;

import org.apache.shiro.spring.web.ShiroFilterFactoryBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by baozang Cotter on 2018/11/27.
 */
@Configuration
public class ShiroConfig {
    @Bean
    public ShiroFilterFactoryBean shiroFilter(SecurityManager securityManager) {
        return null;
    }

//    @Bean
//    public MyShiroRealm myShiroRealm() {
//        return null;
//    }

    @Bean
    public SecurityManager securityManager() {
        return null;
    }

}
