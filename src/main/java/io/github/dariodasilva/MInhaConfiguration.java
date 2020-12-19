package io.github.dariodasilva;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MInhaConfiguration {

    @Bean(name = "applicationName")
    public String applicationName(){
        return "Sistema de Vendas";
    }

    @Bean(name = "configuracaoName")
    public String configuracaoName(){
        return "Sistema de Configuracao";
    }
}
