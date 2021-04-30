package com.zrtech.bookstoremanager.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
public class SwaggerConfig {

    private static final String BOOKS_BASE_PACKAGE = "com.zrtech.bookstoremanager";
    private static final String BOOKS_TITLE = "BooksStore Manager Demo";
    private static final String BOOKS_DESCRIPTION = "API para BookStore Manager";
    private static final String BOOKS_VERSION = "1.0.0";
    private static final String BOOKS_CONTACT_NAME = "Ariane Coelho";
    private static final String BOOKS_CONTACT_URL = "github.com/arianepd";
    private static final String BOOKS_CONTACT_EMAIL = "ariane-clh@homail.com";

    @Bean
    public Docket api(){
        return new Docket(DocumentationType.SWAGGER_2)
                .select()
                .apis(RequestHandlerSelectors.basePackage(BOOKS_BASE_PACKAGE))
                .paths(PathSelectors.any())
                .build()
                .apiInfo(buildApiInfo());
    }

    private ApiInfo buildApiInfo() {
        return new ApiInfoBuilder()
                .title(BOOKS_TITLE)
                .description(BOOKS_DESCRIPTION)
                .version(BOOKS_VERSION)
                .contact(new Contact(BOOKS_CONTACT_NAME, BOOKS_CONTACT_URL, BOOKS_CONTACT_EMAIL))
                .build();

    }


}
