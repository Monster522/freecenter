package com.lin.test.conf;

import com.baomidou.mybatisplus.core.MybatisConfiguration;
import com.baomidou.mybatisplus.core.MybatisXMLLanguageDriver;
import com.baomidou.mybatisplus.extension.plugins.OptimisticLockerInterceptor;
import com.baomidou.mybatisplus.extension.plugins.PaginationInterceptor;
import com.baomidou.mybatisplus.extension.plugins.PerformanceInterceptor;
import com.baomidou.mybatisplus.extension.spring.MybatisSqlSessionFactoryBean;
import com.baomidou.mybatisplus.spring.boot.starter.MybatisPlusProperties;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.type.JdbcType;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;

/**
 * Created by baozang Cotter on 2018/11/6.
 */
@Configuration
@MapperScan("com.lin.test.dao")
public class MybatisConfigMetaObjOptLockConfig {
//
//    @Bean("mybatisSqlSession")
//    public SqlSessionFactory sqlSessionFactory(DataSource dataSource) throws Exception {
//        String[] strings = {"classpath:com/lin/test/*/*.xml"};
//        MybatisPlusProperties mybatisPlusProperties = new MybatisPlusProperties();
//        mybatisPlusProperties.setMapperLocations(strings);
//
//        MybatisSqlSessionFactoryBean sqlSessionFactory = new MybatisSqlSessionFactoryBean();
//        sqlSessionFactory.setDataSource(dataSource);
//        sqlSessionFactory.setMapperLocations(mybatisPlusProperties.resolveMapperLocations());
////        sqlSessionFactory.setTypeAliasesPackage("com.baomidou.mybatisplus.test.h2.entity.persistent");
//
////        MybatisConfiguration configuration = new MybatisConfiguration();
////        configuration.setDefaultScriptingLanguage(MybatisXMLLanguageDriver.class);
////        configuration.setJdbcTypeForNull(JdbcType.NULL);
////        sqlSessionFactory.setConfiguration(configuration);
////
////        PaginationInterceptor pagination = new PaginationInterceptor();
////        sqlSessionFactory.setPlugins(new Interceptor[]{
////                pagination,
////                new PerformanceInterceptor(),
////                new OptimisticLockerInterceptor()
////        });
////
////        sqlSessionFactory.setGlobalConfig(globalConfiguration);
//
//        return sqlSessionFactory.getObject();
//    }
//
////    @Bean
////    public GlobalConfiguration globalConfiguration() {
////        GlobalConfiguration conf = new GlobalConfiguration(new LogicSqlInjector());
////        conf.setLogicDeleteValue("-1");
////        conf.setLogicNotDeleteValue("1");
////        conf.setIdType(2);
////        conf.setMetaObjectHandler(new H2MetaObjectHandler());
////        return conf;
////    }
}
