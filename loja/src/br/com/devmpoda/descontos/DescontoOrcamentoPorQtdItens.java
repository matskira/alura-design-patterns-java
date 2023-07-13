package br.com.devmpoda.descontos;

import br.com.devmpoda.Orcamento;

import java.math.BigDecimal;

public class DescontoOrcamentoPorQtdItens extends Desconto{

    public DescontoOrcamentoPorQtdItens(Desconto proximo) {
        super(proximo);
    }

    @Override
    public BigDecimal calcular(Orcamento orcamento) {
        if (orcamento.getQuantidadeItens() > 5){
            return orcamento.getValor().multiply(new BigDecimal("0.1"));
        }
        return proximo.calcular(orcamento);
    }
}
