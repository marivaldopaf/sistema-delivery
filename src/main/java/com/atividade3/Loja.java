package com.atividade3;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.List;
import java.util.Map;
import java.util.UUID;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class Loja {
    private UUID id;
    private String nome;
    private LocalDateTime dataCadastro;
    private LocalTime horarioAberta;
    private LocalTime horarioFechada;
    private Boolean aberto;
    private Boolean ativo;
    private Boolean aceitaRetirada;
    private BigDecimal taxaDelivery;
    private Integer tempoMinimoEntrega;
    private Integer tempoMaximoEntrega;
    private Map<String, String> contatos;
    private Map<String, String> redes;
    private String urlFotoBanner;
    private Endereco endereco;
    private List<Usuario> responsaveis;
    private List<Produto> produtos;
    private List<FormaPagamento> formasPagamento;

}
