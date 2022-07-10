package io.github.hugo.rest.controller;

import io.github.hugo.domain.entity.Cliente;
import io.github.hugo.domain.repository.Clientes;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@Controller
public class ClienteController {

    private Clientes clientes;

    public ClienteController(Clientes clientes) {
        this.clientes = clientes;
    }

    @GetMapping("/api/clientes/{id}")
    @ResponseBody
    public ResponseEntity getClienteById( @PathVariable Integer id){
        Optional<Cliente> cliente = clientes.findById(id);
        if(cliente.isPresent()){
            return ResponseEntity.ok( cliente.get());
        }else{
            return ResponseEntity.notFound().build();
        }
    }
    @PostMapping("/api/clientes")
    @ResponseBody
    public ResponseEntity save( @RequestBody Cliente cliente){
        Cliente clienteSalvo = clientes.save(cliente);
        return ResponseEntity.ok(clienteSalvo);
    }

}
