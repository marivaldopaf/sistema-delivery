package com.atividade3;

import java.util.UUID;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class PermissaoUsuario {
    private UUID id;
    private String nome;
    private String descricao;

}
