package com.crom.mybatis.config;

import javax.sql.DataSource;

import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DataSourceConfig {
	
    @Bean
    public DataSource getDataSource() {
        DataSourceBuilder dataSourceBuilder = DataSourceBuilder.create();
        dataSourceBuilder.driverClassName("com.mysql.cj.jdbc.Driver");
        dataSourceBuilder.url("jdbc:mysql://sql6.freemysqlhosting.net/sql6455912?reconnect=true&ssl=true&sslmode=require");
        dataSourceBuilder.username("sql6455912");
        dataSourceBuilder.password("7sagEAXmMz");
        return dataSourceBuilder.build();
    }
}