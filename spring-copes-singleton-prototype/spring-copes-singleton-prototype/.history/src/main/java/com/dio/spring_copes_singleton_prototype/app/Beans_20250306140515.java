package com.dio.spring_copes_singleton_prototype.app;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Beans {
    @Bean

    public Remetente remetente() {
        System.out.println("CRIANDO UM OBJETO REMETENTE");
        Remetente remetente = new Remetente();
        remetente.setNome("Digital Innovation One");
        remetente.setEmail("noreply@dio.com.br");
        return remetente;
    }
}
