package com.reus.config;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Repository;

/**
 * 自动注入application.properties文件中的属性时一定要将类或者方法使用@Repository或者@Bean标记起来。
 * 使用的时候也要通过@Autowired，即自动注入使用，不能够使用new来使用。注意还要使用@ComponentScan
 * 
 */

@Repository
@ConfigurationProperties(prefix="spring.datasource",ignoreNestedProperties=false)
public class DataSourceConfig {
	private String driverClassName;
	private String url;
	private String username;
	private String password;
	public String getDriverClassName() {
		return driverClassName;
	}
	public void setDriverClassName(String driverClassName) {
		this.driverClassName = driverClassName;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	@Override
	public String toString() {
		return "DataSourceConfig [driverClassName=" + driverClassName
				+ ", url=" + url + ", username=" + username + ", password="
				+ password + "]";
	}
	
}
