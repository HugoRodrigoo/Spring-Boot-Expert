package io.github.hugo;


import io.github.hugo.domain.entiti.Cliente;
import io.github.hugo.domain.repositorio.Clientes;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.gson.GsonAutoConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.http.converter.json.GsonBuilderUtils;

import java.util.List;


@SpringBootApplication
public class VendasApplication {

    @Bean
    public CommandLineRunner init(@Autowired Clientes clientes){
        return  args -> {
            System.out.println("Salvando clientes");

            clientes.save(new Cliente("hugo"));
            clientes.save(new Cliente("outrocliente"));

            String nome1 = "Hugo";
            boolean existe = clientes.existsByNome(nome1);
            if(existe == true){
                System.out.println("existe o nome "+nome1+" na lista");
            }else{
                System.out.println("não exite o nome "+nome1+" na lista");;
            }




        };
    }

    public static void main(String[] args) {
        SpringApplication.run(VendasApplication.class, args);
    }
}
