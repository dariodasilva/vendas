package io.github.dariodasilva;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class VendasApplication {

    @Autowired
    @Qualifier("applicationName")
    private String applicationName;

    @Autowired
    @Qualifier("configuracaoName")
    private String configuracaoName;

    @GetMapping("/hello")
    public String helloWord(){
        return configuracaoName;
    }
    @GetMapping("/hello/dario")
    public String helloWord2(){
        return applicationName;
    }



    public static void main(String[] args) {
        SpringApplication.run(VendasApplication.class, args);
    }
}
