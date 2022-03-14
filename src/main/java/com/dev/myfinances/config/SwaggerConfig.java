package com.dev.myfinances.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.service.VendorExtension;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import java.util.ArrayList;

@Configuration
@EnableSwagger2
public class SwaggerConfig {

    @Bean
    public Docket billApi() {
        return new Docket(DocumentationType.SWAGGER_2)
                .select()
                .apis(RequestHandlerSelectors.basePackage("com.dev.myfinances.controller"))
                .paths(PathSelectors.ant("/**"))
                .build()
                .apiInfo(metaInfo());
    }

    private ApiInfo metaInfo() {
        return new ApiInfo(
                "Bills API REST",
                "API REST to manager Bills",
                "1.0",
                "Terms of Service",
                 buildContact(),
                "Apache License Version 2.0",
                "https://www.apache.org/licenses/LICENSE-2.0", new ArrayList<VendorExtension>()
        );
    }

    private Contact buildContact() {
        return new Contact("Carlos Eduardo Feitosa da Costa",
                "https://www.linkedin.com/in/carloseduti/",
                "carloseduardoti@hotmail.com");
    }

}
