package com.learams.spring_cloud_api_gateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.cloud.gateway.route.RouteLocator;
@SpringBootApplication
public class SpringCloudApiGatewayApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringCloudApiGatewayApplication.class, args);
	}
	@Bean
	public RouteLocator myRoutes(RouteLocatorBuilder builder) {
		return builder.routes()
				// Example route 1: Forward to httpbin
				.route(p -> p
						.path("/api/students")
						.filters(f -> f.addRequestHeader("service", "demo-service"))
						.uri("http://localhost:8081/")
				)
				.build();
	}
}
