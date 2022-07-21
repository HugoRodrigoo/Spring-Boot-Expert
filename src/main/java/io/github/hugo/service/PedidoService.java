package io.github.hugo.service;

import io.github.hugo.domain.entity.Pedido;
import io.github.hugo.rest.dto.PedidoDTO;


import java.util.Optional;

public interface PedidoService {

    Pedido salvar(PedidoDTO dto);

    Optional<Pedido> obterPedidoCompleto(Integer id);

}
