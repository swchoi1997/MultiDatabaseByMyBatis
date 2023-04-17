//package com.example.multidatabasetestmybatis.global;
//
//import com.zaxxer.hikari.HikariConfig;
//import com.zaxxer.hikari.HikariDataSource;
//import javax.sql.DataSource;
//import org.springframework.beans.factory.annotation.Qualifier;
//import org.springframework.boot.context.properties.ConfigurationProperties;
//import org.springframework.boot.context.properties.EnableConfigurationProperties;
//import org.springframework.boot.jdbc.DataSourceBuilder;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.context.annotation.Primary;
//
//
//@Configuration
//@EnableConfigurationProperties
//public class DataSourceProperties {
//
//    @Bean(name = "secondaryHikariConfig")
//    @Qualifier("primaryHikariConfig")
//    @Primary
//    @ConfigurationProperties(prefix = "spring.datasource.hikari.test1")
//    public HikariConfig primaryHikariConfig() {
//        return new HikariConfig();
//    }
//
//    @Bean
//    @Primary
//    @Qualifier("test1DataSource")
//    public DataSource primaryDataSource() throws Exception {
//        return new HikariDataSource(primaryHikariConfig());
//    }
//
//
//    @Bean
//    @Qualifier("secondaryHikariConfig")
//    @ConfigurationProperties(prefix = "spring.datasource.hikari.test2")
//    public HikariConfig secondaryHikariConfig() {
//        return new HikariConfig();
//    }
//
//    @Bean
//    @Qualifier("test2DataSource")
//    public DataSource secondaryDataSource() throws Exception {
//        return new HikariDataSource(secondaryHikariConfig());
//    }
//}
