package com.eauction.namingregistry;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
import org.springframework.context.annotation.Bean;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.web.SecurityFilterChain;

@SpringBootApplication
@EnableEurekaServer
public class EauctionNamingregistryApplication {

	public static void main(String[] args) {
		SpringApplication.run(EauctionNamingregistryApplication.class, args);
	}
	
	@Bean
	public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {

		http.authorizeRequests().anyRequest().permitAll().and().csrf().disable();
		http.headers().frameOptions().sameOrigin();

		return http.build();
	}
}