package com.example.api_gateway.config;
import org.springdoc.core.models.GroupedOpenApi;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SwaggerConfig {

    @Bean
    public GroupedOpenApi userServiceApi() {
        return GroupedOpenApi.builder()
                .group("user-service")
                .pathsToMatch("/api/users/**")
                .build();
    }

    @Bean
    public GroupedOpenApi orderServiceApi() {
        return GroupedOpenApi.builder()
                .group("order-service")
                .pathsToMatch("/api/orders/**")
                .build();
    }
}