package org.com.FeedbackSystem.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@Configuration
@ComponentScan(basePackages={"org.com.FeedbackSystem","org.com.FeedbackSystem.Controller","org.com.FeedBackSystem.model","org.com.FeedbackSystem.Repository","org.com.FeedbackSystem.Service"})
@EnableWebMvc
public class MvcConfiguration extends WebMvcConfigurerAdapter{

	@Bean
	public ViewResolver getViewResolver(){
		InternalResourceViewResolver resolver = new InternalResourceViewResolver();
		resolver.setPrefix("/WEB-INF/views/");
		resolver.setSuffix(".jsp");
		return resolver;
	}
	
	@Override
	public void addResourceHandlers(ResourceHandlerRegistry registry) {
		registry.addResourceHandler("/resources/**").addResourceLocations("/resources/");
	}
@Bean(name="dataSource")
public DriverManagerDataSource getDataSource() {
	DriverManagerDataSource dataSource=new DriverManagerDataSource();
	dataSource.setUrl("jdbc:mysql://localhost:3306/db");
	dataSource.setDriverClassName("com.mysql.cj.jdbc.Driver");
	dataSource.setUsername("root");
	dataSource.setPassword("root");
	
	return dataSource;
}
@Bean(name="template")
public JdbcTemplate gettemplate() {
	JdbcTemplate template=new JdbcTemplate();
	template.setDataSource(getDataSource());
	
	return template;
	
}
	}
