package com.atividade3;

import java.util.List;
import java.util.UUID;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class GrupoUsuario {
    private UUID id;
    private String nome;
    private List<PermissaoUsuario> permissoes;
}
