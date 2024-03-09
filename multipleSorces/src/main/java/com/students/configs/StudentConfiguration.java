package com.students.configs;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.boot.orm.jpa.EntityManagerFactoryBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import jakarta.persistence.EntityManagerFactory;

@Configuration
@EnableTransactionManagement
@EnableJpaRepositories(
    entityManagerFactoryRef = "studentEntityManagerFactory",
    transactionManagerRef = "studentTransactionManager",
    basePackages = {
        "com.students.repositories"
    }
)
public class StudentConfiguration {
	    @Primary
	    @Bean(name = "studentDataSource")
	    @ConfigurationProperties(prefix = "spring.datasource.h2")
	    DataSource studentDataSource() {
	        return DataSourceBuilder.create().build();
	    }

	    @Primary
	    @Bean(name = "studentEntityManagerFactory")
	    LocalContainerEntityManagerFactoryBean
	    entityManagerFactory(
	    		EntityManagerFactoryBuilder builder,
	        @Qualifier("studentDataSource") DataSource dataSource) {
			return builder.dataSource(dataSource)
					.packages("com.students.entities")
		            .persistenceUnit("dataSource2")
		            .build();
	    }

	    @Primary
	    @Bean(name = "studentTransactionManager")
	     PlatformTransactionManager studentTransactionManager(
	        @Qualifier("studentEntityManagerFactory") EntityManagerFactory studentEntityManagerFactory ) {
	        return new JpaTransactionManager(studentEntityManagerFactory);
	    }
}
