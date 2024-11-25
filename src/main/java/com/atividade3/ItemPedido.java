package com.atividade3;

import java.util.UUID;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ItemPedido {
    private Integer quantidade;
    private BigDecimal valorTotal;
    private String observacao;

}
