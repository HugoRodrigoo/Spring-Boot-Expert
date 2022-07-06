package io.github.hugo;


import io.github.hugo.domain.entity.Cliente;
import io.github.hugo.domain.repository.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.List;


@SpringBootApplication
public class VendasApplication {

    @Bean
    public CommandLineRunner init(@Autowired ClienteRepository clienteRepository){
        return  args -> {
            System.out.println("Salvando clientes");

            clienteRepository.save(new Cliente("hugo"));
            clienteRepository.save(new Cliente("outrocliente"));

            String nome1 = "Hugo";
            List<Cliente> res = clienteRepository.encontraPorNome(nome1);
            res.forEach(System.out::println);




        };
    }

    public static void main(String[] args) {
        SpringApplication.run(VendasApplication.class, args);
    }
}
