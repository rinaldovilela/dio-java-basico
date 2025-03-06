package com.dio.spring_properties_value.app;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class SistemaMensagem implements CommandLineRunner {
    private String nome = "RINALDO VILELA";
    private String email = "rinaldo@dio.com";
    private List<Long> telefones = new ArrayList<>(Arrays.asList(new Long[] { 123456789L }));

    @Override
    public void run(String... args) throws Exception {
        System.out.println(
                "Mensagem enviada por : " + nome + "\nEmail: " + email + "\nCom telefones para contato: " + telefones);
        System.out.println("Seu cadastro foi aprovado");
    }

}