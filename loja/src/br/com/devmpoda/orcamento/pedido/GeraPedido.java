package br.com.devmpoda.orcamento.pedido;

import br.com.devmpoda.orcamento.Orcamento;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public class GeraPedido {

    private String cliente;
    private BigDecimal valorOrcamento;
    private int quantidadeItens;

    public GeraPedido(String cliente, BigDecimal valorOrcamento, int quantidadeItens) {
        this.cliente = cliente;
        this.valorOrcamento = valorOrcamento;
        this.quantidadeItens = quantidadeItens;
    }

    public void executa() {
        Orcamento orcamento = new Orcamento(this.valorOrcamento, this.quantidadeItens);

        Pedido pedido = new Pedido(this.cliente, LocalDateTime.now(), orcamento);

        //Execução de comandos vai sempre ficar repetida;
        System.out.println("Salvar pedido no Banco de Dados");
        System.out.println("Enviar e-mail com dados do novo pedido");
    }

    public String getCliente() {
        return cliente;
    }

    public BigDecimal getValorOrcamento() {
        return valorOrcamento;
    }

    public int getQuantidadeItens() {
        return quantidadeItens;
    }
}
