package io.github.hugo;


import io.github.hugo.domain.entity.Cliente;
import io.github.hugo.domain.entity.Produto;
import io.github.hugo.domain.repository.Clientes;
import io.github.hugo.domain.repository.Produtos;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.math.BigDecimal;


@SpringBootApplication
public class VendasApplication {


    public static void main(String[] args) {
        SpringApplication.run(VendasApplication.class, args);
    }
}