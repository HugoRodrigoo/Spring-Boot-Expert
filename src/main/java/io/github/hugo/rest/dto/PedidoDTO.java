package io.github.hugo.rest.dto;

import io.github.hugo.validation.NotEmptyList;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotNull;
import java.math.BigDecimal;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class PedidoDTO {
    @NotNull(message = "{CAMPO.CODIGO-CLIENTE.OBRIGATORIO}")
    private Integer cliente;
    @NotNull(message = "{CAMPO.TOTAL-PEDIDO.OBRIGATORIO}")
    private BigDecimal total;
    @NotEmptyList(message = "{CAMPO.ITENS-PEDIDO.OBRIGATORIO}")
    private List<ItemPedidoDTO> items;



}
