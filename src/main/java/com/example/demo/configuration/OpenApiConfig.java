package com.example.demo.configuration;

import io.swagger.v3.oas.models.*;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.Info;
import org.springframework.context.annotation.*;

@Configuration
public class OpenApiConfig {

    @Bean
    public OpenAPI customOpenAPI() {
        return new OpenAPI()
                .info(new Info()
                        .title("Shopping List API")
                        .version("1.0")
                        .description("API para gerenciamento de lista de compras")
                        .contact(new Contact()
                                .name("Renato Pereira")
                                .email("renatopereiradev@gmail.com")));
    }
}