package io.github.hugo.domain.entity;

import lombok.*;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.math.BigDecimal;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "produto")
public class Produto {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Integer id;

    @Column(name = "descricao")
    @NotEmpty(message = "{CAMPO.DESCRICAO.OBRIGATORIO}")
    private String descricao;

    @Column(name = "preco_unitario")
    @NotNull(message = "{CAMPO.PRECO.OBRIGATORIO}")
    private BigDecimal preco;

}