package io.github.hugo.rest.controller;


import io.github.hugo.domain.entity.Pedido;
import io.github.hugo.rest.dto.PedidoDTO;
import io.github.hugo.service.PedidoService;
import org.springframework.web.bind.annotation.*;

import static org.springframework.http.HttpStatus.CREATED;


@RestController
@RequestMapping("/api/pedidos")
public class PedidoController {

    private PedidoService pedidoService;

    public PedidoController(PedidoService pedidoService) {
        this.pedidoService = pedidoService;
    }
    @PostMapping
    @ResponseStatus(CREATED)
    public Integer save(@RequestBody PedidoDTO dto){
        Pedido pedido =  pedidoService.salvar(dto);
        return pedido.getId();
    }
}
