package com.atividade3;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.UUID;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class Loja {
    private UUID id;
    private String nome;
    private LocalDateTime dataCadastro;
    private LocalTime horarioAberta;
    private LocalTime horarioFechada;
    private boolean aberto;
    private boolean ativo;
    private boolean aceitaRetirada;
    private BigDecimal taxaDelivery;
    private Integer tempoMinimoEntrega;
    private Integer tempoMaximoEntrega;
    private Map<String, String> contatos;
    private Map<String, String> redes;
    private String urlFotoBanner;
}
