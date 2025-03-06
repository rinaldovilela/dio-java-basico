package com.dio.spring_copes_singleton_prototype;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SpringCopesSingletonPrototypeApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringCopesSingletonPrototypeApplication.class, args);
	}

	@Bean
	public CommandLinerRunner run() {SistemaMensagem sistema) throws Exception {
		return args ->  {
			sistema.enviarConfirmacaoCadastro();
			sistema.enviarMensagemBoasVindas();
		}
	}}

}
