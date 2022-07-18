package io.github.hugo.service;

import io.github.hugo.domain.entity.Pedido;
import io.github.hugo.rest.dto.PedidoDTO;

public interface PedidoService {

    Pedido salvar(PedidoDTO dto);
}
