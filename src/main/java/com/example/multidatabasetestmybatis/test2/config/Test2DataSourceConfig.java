package com.example.multidatabasetestmybatis.test2.config;


import javax.sql.DataSource;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.SqlSessionTemplate;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
@MapperScan(
        value = "com.example.multidatabasetestmybatis.test2",
        sqlSessionFactoryRef = "test2SqlSessionFactory"
)
public class Test2DataSourceConfig {

    @Bean
    @ConfigurationProperties(prefix = "spring.datasource.hikari.test2")
    public DataSource test2DataSource() {
        return DataSourceBuilder.create().build();
    }

    @Bean(name = "test2SqlSessionFactory")
    public SqlSessionFactory test1SqlSessionFactory(
            @Qualifier("test2DataSource") DataSource test1DataSource, ApplicationContext applicationContext) throws Exception {
        SqlSessionFactoryBean sqlSessionFactoryBean = new SqlSessionFactoryBean();
        sqlSessionFactoryBean.setDataSource(test1DataSource);

        sqlSessionFactoryBean.setMapperLocations(applicationContext.getResources("classpath:mybatis/test2/*.xml"));

        return sqlSessionFactoryBean.getObject();
    }

    @Bean(name = "test2SqlSessionTemplate")
    public SqlSessionTemplate db1SqlSessionTemplate(SqlSessionFactory test2SqlSessionFactory) throws Exception {
        return new SqlSessionTemplate(test2SqlSessionFactory);
    }

}
