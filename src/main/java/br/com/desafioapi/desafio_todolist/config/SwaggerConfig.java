package br.com.desafioapi.desafio_todolist.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.License;

@Configuration
public class SwaggerConfig {

    @Bean
    public OpenAPI customAPI() {

        return new OpenAPI().info(new Info()
                .title("Todo List")
                .description("API para gerenciamento de lista de tarefas")
                .version("1.0.0")
                .license(new License()
                        .name("Licença da API")
                        .url("")));
    }

}
