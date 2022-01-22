package com.zahar.margarita.config;

import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.orm.hibernate5.HibernateTransactionManager;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import javax.sql.DataSource;
import java.util.Properties;

@Configuration
@EnableTransactionManagement
public class DbConfig {

    @Bean(name = "dataSource")
    DataSource dataSource(){

        HikariConfig hikariConfig = new HikariConfig();
        hikariConfig.setJdbcUrl("jdbc:postgresql://localhost:5432/postgres");
        hikariConfig.setDriverClassName("org.postgresql.Driver");
        hikariConfig.setUsername("postgres");
        hikariConfig.setPassword("admin");

        return new HikariDataSource(hikariConfig);
    }

    @Autowired
    @Bean(name = "transactionManager")
    public HibernateTransactionManager transactionManager(SessionFactory sessionFactory) {
        return new HibernateTransactionManager(sessionFactory);
    }


    @Autowired
    @Bean(name = "entityManagerFactory")
    public SessionFactory sessionFactory(DataSource dataSource) throws Exception {

        LocalSessionFactoryBean factoryBean = new LocalSessionFactoryBean();
        Properties properties = new Properties();
        properties.put("hibernate.hbm2ddl.auto", "update");
        factoryBean.setHibernateProperties(properties);
        factoryBean.setPackagesToScan("com.zahar.margarita");
        factoryBean.setDataSource(dataSource);
        factoryBean.afterPropertiesSet();
        return factoryBean.getObject();
    }


}
