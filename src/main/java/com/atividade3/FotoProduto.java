package com.atividade3;

import java.util.UUID;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class FotoProduto {
    private UUID id;
    private String titulo;
    private String descricao;
    private String url;
}
