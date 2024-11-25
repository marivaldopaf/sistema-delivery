package com.atividade3;

import java.math.BigDecimal;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class ItemPedido {
    private Integer quantidade;
    private BigDecimal valorTotal;
    private String observacao;
    private Pedido pedido;
    private Produto produto;
}
