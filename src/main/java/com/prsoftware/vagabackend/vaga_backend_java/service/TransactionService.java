package com.prsoftware.vagabackend.vaga_backend_java.service;

import java.time.OffsetDateTime;
import java.util.DoubleSummaryStatistics;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedDeque;

import org.springframework.stereotype.Service;

import com.prsoftware.vagabackend.vaga_backend_java.model.Transaction;

/*Classe para Criar a Regra de Negocio */

@Service
public class TransactionService {

    /*Criando uma Query para armazenar os dados em Mémoria */
    private final Queue<Transaction> transactions = new ConcurrentLinkedDeque<>();

    /*Criando uma classe para adicionar a Transação */
    public void addTransaction(Transaction transaction){
        transactions.add(transaction);
    }

    /*Criando uma Classe para Limpar a Transação */
    public void clearTransaction(){
        transactions.clear();
    }

    /*Criando uma Classe para Pegar os Dados de Statistica */
    public DoubleSummaryStatistics getStatistics(){
        OffsetDateTime now = OffsetDateTime.now(); //Pegando a Data e Hora da Transação
        return transactions.stream()
                //.filter(t -> t.getDataHora().isAfter(now.minusSeconds(60))) //Filtrando para ver se a Transação está dentro de 1 minuto
                .mapToDouble(Transaction::getValor) //Pegando o Valor
                .summaryStatistics();
    }
    
}
