package com.dio.spring_copes_singleton_prototype.app;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component

public class SistemaMensagem {
    @Autowired
    private Remetente noreply;
    @Autowired
    private Remetente financeiro;

    public void enviarConfirmacaoCadastro() {
        System.out.println(noreply);
        System.out.println("Seu cadastro foi aprovado");
    }

    public void enviarMensagemBoasVindas() {
        financeiro.setEmail("tech@dio.com.br");
        System.out.println(financeiro);
        System.out.println("Bem-vindo Á Tech Elite");
    }
}
