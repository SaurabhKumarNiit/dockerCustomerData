package com.challange.dockerCustomerData;

import com.challange.dockerCustomerData.filter.JwtFilter;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class DockerCustomerDataApplication {

	public static void main(String[] args) {
		SpringApplication.run(DockerCustomerDataApplication.class, args);
	}


	@Bean
	public FilterRegistrationBean jwtFilter(){
		FilterRegistrationBean filterRegistrationBean = new FilterRegistrationBean<>();
		filterRegistrationBean.setFilter(new JwtFilter());
		filterRegistrationBean.addUrlPatterns("/custdata/*");

		return filterRegistrationBean;
	}
}
