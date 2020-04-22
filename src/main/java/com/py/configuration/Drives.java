package com.py.configuration;


import com.alibaba.druid.pool.DruidDataSource;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;


/**
 * @author pangy
 * @version 1.0
 * @date 2020/4/22 0:04
 */
@Configuration
public class Drives {
    @Bean
    @ConfigurationProperties(prefix = "jdbc")
    public DataSource getDateSource(){
        return new DruidDataSource();
    }
}
