package io.github.hugo.service.impl;

import io.github.hugo.domain.repository.Pedidos;
import io.github.hugo.service.PedidoService;
import org.springframework.stereotype.Service;

@Service
public class PedidoServiceImpl implements PedidoService {

    private Pedidos repository;

    public PedidoServiceImpl(Pedidos repository) {
        this.repository = repository;
    }



}
