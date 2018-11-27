package com.lin.test.conf;

import com.lin.test.filter.FreeFilter;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by baozang Cotter on 2018/11/1.
 */
@Configuration
public class WebConfiguration {
//    @Bean
//    public FilterRegistrationBean testFilterRegistration() {
//        FilterRegistrationBean registration = new FilterRegistrationBean(new FreeFilter());
//        registration.addUrlPatterns("/free/test");
//        registration.addInitParameter("paramName", "paramValue");
//        registration.setName("freeFilter");
//        return registration;
//    }

}
