package com.example.ZuulGateway;

import Filters.ZuulLogin2Filter;
import Filters.ZuulLoginFilter;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
@EnableZuulProxy
@EnableDiscoveryClient
public class ZuulGatewayApplication {

	public static void main(String[] args) {
		SpringApplication.run(ZuulGatewayApplication.class, args);
	}

	@Bean
	public ZuulLoginFilter simpleFilter1() {
		return new ZuulLoginFilter();
	}

	@Bean
	public ZuulLogin2Filter simpleFilter2() {
		return new ZuulLogin2Filter();
	}


}
