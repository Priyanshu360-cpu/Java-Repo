package com.ibm.webapp.config;


import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;

import com.zaxxer.hikari.HikariDataSource;

@Configuration
@ComponentScan(basePackages = "com.ibm.springjdbc2")
public class DatabaseConfig {

	@Bean
	public DataSource dataSource() {
		HikariDataSource ds = new HikariDataSource();
		ds.setJdbcUrl("jdbc:mysql://sql12.freesqldatabase.com:3306/sql12816200");
		ds.setUsername("sql12816200");
		ds.setPassword("M3mmwkInkh");
		ds.setDriverClassName("com.mysql.cj.jdbc.Driver");
		return ds;
	}

	@Bean
	public JdbcTemplate jdbcTemplate(DataSource dataSource) {
		return new JdbcTemplate(dataSource);
	}
}