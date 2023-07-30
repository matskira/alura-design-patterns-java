package br.com.devmpoda;

import java.math.BigDecimal;

public class Orcamento {

    private BigDecimal valor;
    private int quantidadeItens;
    private String situacao;

    public Orcamento(BigDecimal valor, int quantidadeItens) {
        this.valor = valor;
        this.quantidadeItens = quantidadeItens;
    }

    public void aplicarDescontoExtra() {
        BigDecimal valorDoDescontoExtra = BigDecimal.ZERO;
        if ("EM ANALISE".equals(situacao)) {
            valorDoDescontoExtra = new BigDecimal("0.05");
        } else if ("APROVADO".equals(situacao)) {
            valorDoDescontoExtra = new BigDecimal("0.02");
        }

        this.valor = this.valor.subtract(valorDoDescontoExtra);
    }

    public void aprovar() {
        this.situacao = "APROVADO";
    }

    public BigDecimal getValor() {
        return valor;
    }

    public int getQuantidadeItens() {
        return quantidadeItens;
    }
}
