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
        dataSourceBuilder.url("jdbc:mysql://b6ecaef51dbee5:1204900e@us-cdbr-east-04.cleardb.com/heroku_e556888335116c5?reconnect=true&sslmode=require");
        dataSourceBuilder.username("b6ecaef51dbee5");
        dataSourceBuilder.password("1204900e");
        return dataSourceBuilder.build();
    }
}

