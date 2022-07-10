package io.github.hugo.rest.controller;

import io.github.hugo.domain.entity.Cliente;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class ClienteController {

    @RequestMapping(
            value = "/hello/{nome}",
            method = RequestMethod.GET,
            consumes = {"application/json","application/xml"},
            produces = {"application/json","application/xml"}
    )
    @ResponseBody
    public String helloCliente(@PathVariable("nome") String nomeCliente, @RequestBody Cliente cliente){
        return  String.format("Hellou %s ", nomeCliente);
    }

}
