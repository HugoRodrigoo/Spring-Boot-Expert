package io.github.hugo.domain.entity;

import javax.persistence.*;
import java.math.BigDecimal;
@Entity
@Table(name = "Produto")
public class Produto {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Integer id;
    private String discricao;
    private BigDecimal preco_unitario;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDiscricao() {
        return discricao;
    }

    public void setDiscricao(String discricao) {
        this.discricao = discricao;
    }

    public BigDecimal getPreco_unitario() {
        return preco_unitario;
    }

    public void setPreco(BigDecimal preco) {
        this.preco_unitario = preco;
    }
}
