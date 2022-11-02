package com.example.demoapi.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import io.swagger.v3.oas.models.ExternalDocumentation;
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.License;

@Configuration
public class OpenApiConfig {
    @Bean
    public OpenAPI openAPI(@Value("${springdoc.version") String appVersion) {
        return new OpenAPI()
            .info(new Info().title("Demo-Api")
            .description("Demo-Api 입니다")
            .version("v0.0.1")
            .license(new License().name("Apache 2.0").url("http://springdoc.org")))
            .externalDocs(new ExternalDocumentation()
            .description("Springdoc-openapi Documentation")
            .url("https://springdoc.org/index.html"));
     }
    
}
