package com.atividade3;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Map;
import java.util.UUID;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

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
    private Map<String, String> contatos;
    private String urlFoto;
    private List<Endereco> enderecos;
    private Endereco enderecoPrincipal;
    private Genero genero;
    private List<GrupoUsuario> grupos;
    private List<Pedido> pedidos; 
}
