package br.com.devmpoda.descontos;

import br.com.devmpoda.Orcamento;

import java.math.BigDecimal;

public class DescontoOrcamentoPorQtdItens extends Desconto {

    public DescontoOrcamentoPorQtdItens(Desconto proximo) {
        super(proximo);
    }

    @Override
    public BigDecimal efetuarCalculo(Orcamento orcamento) {
        return orcamento.getValor().multiply(new BigDecimal("0.1"));
    }

    @Override
    public boolean deveAplicar(Orcamento orcamento) {
        return orcamento.getQuantidadeItens() > 5;
    }
}
