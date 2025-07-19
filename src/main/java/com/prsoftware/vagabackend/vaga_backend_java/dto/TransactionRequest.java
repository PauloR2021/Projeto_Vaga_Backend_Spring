package com.prsoftware.vagabackend.vaga_backend_java.dto;

/*Criando uma Classe para realizar as Validações */
import java.time.OffsetDateTime;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;

public class TransactionRequest {

    @NotNull /*Não vai receber valor Nulo nessa variavel */
    @Min(0) /*Não vai receber valor menor que 0 */
    private Double valor;

    @NotNull
    private OffsetDateTime dataHora;

    public Double getValor() {
        return valor;
    }

    public OffsetDateTime getDataHora() {
        return dataHora;
    }
    
    
}
