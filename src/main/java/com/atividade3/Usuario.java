package com.atividade3;

import java.time.LocalDateTime;
import java.util.UUID;

@Data
@AllArgsConstructor
@NoArgsConstructor

public Usuario(UUID id, String nomeCompleto, String apelido, String cpf, String email, String senha,
            LocalDateTime dataCadastro, LocalDateTime nascimento, String urlFoto) {
        this.id = id;
        this.nomeCompleto = nomeCompleto;
        this.apelido = apelido;
        this.cpf = cpf;
        this.email = email;
        this.senha = senha;
        this.dataCadastro = dataCadastro;
        this.nascimento = nascimento;
        this.urlFoto = urlFoto;
    }
    public Usuario() {
    }



public class Usuario {
    private UUID id;
    private String nomeCompleto;
    private String apelido;
    private String cpf;
    private String email;
    private String senha;
    private LocalDateTime dataCadastro;
    private LocalDateTime nascimento;
    private Map<String, String>
    private String urlFoto;
    
    
}
