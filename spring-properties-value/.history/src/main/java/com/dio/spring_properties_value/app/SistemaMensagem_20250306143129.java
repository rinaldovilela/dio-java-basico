package com.dio.spring_properties_value.app;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class SistemaMensagem implements CommandLineRunner {
    private String nome;
    private String email;
    private List<Long> telefones;

    @Override
    public void run(String... args) throws Exception {
        System.out.println(
                "Mensagem enviada por : " + nome + "\nEmail: " + email + "\nCom telefones para contato: " + telefones);
        System.out.println("Seu cadastro foi aprovado");
    }

}
