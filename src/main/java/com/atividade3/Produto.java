package com.atividade3;

import java.math.BigDecimal;
import java.util.List;
import java.util.UUID;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class Produto {
    private UUID id;
    private String nome;
    private String codigoBarras;
    private String descricao;
    private BigDecimal valor;
    private Boolean ativo;
    private List<String> tags;

}
