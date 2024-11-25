package com.atividade3;

import java.util.UUID;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class PermissaoUsuario {
    private UUID id;
    private String nome;
    private String dscricao;
}
