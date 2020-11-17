package com.springboot.demo.config;

import com.alibaba.druid.pool.DruidDataSource;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import javax.sql.DataSource;

@Configuration
@PropertySource("classpath:jdbc.properties")
public class jdbcConfig {
    @Value("${jdbc.driver}")
    String driverClassName;
    @Value("${jdbc.url}")
    String url;
    @Value("${jdbc.user}")
    String username;
    @Value("${jdbc.password}")
    String password;

    @Bean
    public DataSource DataSource(){
        DruidDataSource DruidDataSource = new DruidDataSource();
        DruidDataSource.setUrl(url);
        DruidDataSource.setDriverClassName(driverClassName);
        DruidDataSource.setUsername(username);
        DruidDataSource.setPassword(password);
        return DruidDataSource;
    }
}
