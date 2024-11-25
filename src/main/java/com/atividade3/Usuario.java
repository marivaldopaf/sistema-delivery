package com.atividade3;

import java.time.LocalDateTime;
import java.util.UUID;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class Usuario {
    private UUID id;
    private String nomeCompleto;
    private String apelido;
    private String cpf;
    private String email;
    private String senha;
    private LocalDateTime dataCadastro;
    private LocalDateTime nascimento;
    private Map<String, String>;
    private String urlFoto;   
}
