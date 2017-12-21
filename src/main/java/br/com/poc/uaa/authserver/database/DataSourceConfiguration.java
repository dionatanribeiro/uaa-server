package br.com.poc.uaa.authserver.database;

import org.springframework.boot.autoconfigure.jdbc.DataSourceProperties;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import javax.sql.DataSource;


//@Configuration
public class DataSourceConfiguration {

    @Bean
    @Primary
    @ConfigurationProperties("spring.ds-authserver")
    public DataSourceProperties authserverDataSourceProperties() {
        return new DataSourceProperties();
    }

    @Bean
    @Primary
    @ConfigurationProperties("spring.ds-authserver")
    public DataSource authserverDatasource() {
        return authserverDataSourceProperties().initializeDataSourceBuilder().build();
    }

    @Bean
    @ConfigurationProperties("spring.ds-oauth")
    public DataSourceProperties oauthDataSourceProperties() {
        return new DataSourceProperties();
    }

    @Bean(name = "dsOauth")
    @ConfigurationProperties("spring.ds-oauth")
    public DataSource oauthDatasource() {
        return oauthDataSourceProperties().initializeDataSourceBuilder().build();
    }

}
