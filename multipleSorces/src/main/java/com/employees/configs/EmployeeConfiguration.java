package com.employees.configs;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.orm.jpa.vendor.HibernateJpaVendorAdapter;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import jakarta.persistence.EntityManagerFactory;


@Configuration
@EnableTransactionManagement
@EnableJpaRepositories(entityManagerFactoryRef = "employeeEntityManagerFactory", transactionManagerRef = "employeeTransactionManager", basePackages = {
		"com.employees.repositories" })
public class EmployeeConfiguration {

	@Primary
	@Bean(name = "employeeDataSource")
	@ConfigurationProperties(prefix = "spring.datasource.oracle")
	public DataSource employeeDataSource() {
		return DataSourceBuilder.create().build();
	}

	@Primary
	@Bean(name = "employeeEntityManagerFactory")
	public LocalContainerEntityManagerFactoryBean employeeEntityManagerFactory(
			@Qualifier("employeeDataSource") DataSource dataSource) {
		LocalContainerEntityManagerFactoryBean emf = new LocalContainerEntityManagerFactoryBean();
		emf.setDataSource(dataSource);
		emf.setPackagesToScan("com.employees.entities");
		emf.setPersistenceUnitName("employeePersistenceUnit");

		HibernateJpaVendorAdapter vendorAdapter = new HibernateJpaVendorAdapter();
		emf.setJpaVendorAdapter(vendorAdapter);

		return emf;
	}

	@Primary
	@Bean(name = "employeeTransactionManager")
	public PlatformTransactionManager employeeTransactionManager(
			@Qualifier("employeeEntityManagerFactory") EntityManagerFactory employeeEntityManagerFactory) {
		return new JpaTransactionManager(employeeEntityManagerFactory);
	}
}
