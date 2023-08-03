package br.com.devmpoda.orcamento.pedido;

import br.com.devmpoda.orcamento.Orcamento;

import java.time.LocalDateTime;

public class Pedido {

    private String nomeCliente;
    private LocalDateTime dataPedido;
    private Orcamento orcamento;

    public Pedido(String nomeCliente, LocalDateTime dataPedido, Orcamento orcamento) {
        this.nomeCliente = nomeCliente;
        this.dataPedido = dataPedido;
        this.orcamento = orcamento;
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public LocalDateTime getDataPedido() {
        return dataPedido;
    }

    public Orcamento getOrcamento() {
        return orcamento;
    }
}


