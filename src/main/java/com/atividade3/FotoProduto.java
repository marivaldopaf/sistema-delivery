package com.atividade3;

import java.util.UUID;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class FotoProduto {
    private UUID id;
    private String titulo;
    private String descricao;
    private String url;
}
