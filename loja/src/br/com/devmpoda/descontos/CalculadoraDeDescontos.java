package br.com.devmpoda.descontos;

import br.com.devmpoda.orcamento.Orcamento;

import java.math.BigDecimal;

public class CalculadoraDeDescontos {

    public BigDecimal calcular(Orcamento orcamento) {
        Desconto desconto = new DescontoOrcamentoPorQtdItens(
                new DescontoOrcamentoPorPreco(
                        new SemDesconto()
                )
        );
        return desconto.calcular(orcamento);
    }
}
