package com.itonglian.fms.config.datasource;

import lombok.extern.slf4j.Slf4j;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.SqlSessionTemplate;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
import org.springframework.core.io.support.ResourcePatternResolver;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;

import javax.sql.DataSource;

@Configuration
@MapperScan(basePackages = "com.itonglian.fms.dao.primary", sqlSessionTemplateRef  = "PrimarySqlSessionTemplate")
@Slf4j
public class PrimaryDataSource {
    @Bean(name = "PrimaryDataSourceBean")
    @ConfigurationProperties(prefix = "spring.datasource")
    @Primary
    public DataSource BuildDataSource() {
        return DataSourceBuilder.create().build();
    }

    @Bean(name = "PrimarySqlSessionFactory")
    @Primary
    public SqlSessionFactory CreateSqlSessionFactory(@Qualifier("PrimaryDataSourceBean") DataSource dataSource) throws Exception {
        SqlSessionFactoryBean bean = new SqlSessionFactoryBean();
        bean.setDataSource(dataSource);
        //添加XML目录
        ResourcePatternResolver resolver = new PathMatchingResourcePatternResolver();
        try {
            bean.setMapperLocations(resolver.getResources("classpath*:mapping/*.xml"));
            return bean.getObject();
        } catch (Exception e) {
            log.error("error",e);
            throw new RuntimeException(e);
        }

    }

    @Bean(name = "PrimaryTransactionManager")
    @Primary
    public DataSourceTransactionManager testTransactionManager(@Qualifier("PrimaryDataSourceBean") DataSource dataSource) {
        return new DataSourceTransactionManager(dataSource);
    }

    @Bean(name = "PrimarySqlSessionTemplate")
    @Primary
    public SqlSessionTemplate testSqlSessionTemplate(@Qualifier("PrimarySqlSessionFactory") SqlSessionFactory sqlSessionFactory) throws Exception {
        return new SqlSessionTemplate(sqlSessionFactory);
    }

}
