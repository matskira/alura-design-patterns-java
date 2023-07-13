package br.com.devmpoda.descontos;

import br.com.devmpoda.Orcamento;

import java.math.BigDecimal;

public class DescontoOrcamentoPorPreco extends Desconto{

    public DescontoOrcamentoPorPreco(Desconto proximo) {
        super(proximo);
    }


    public BigDecimal calcular(Orcamento orcamento) {
        if (orcamento.getValor().compareTo(new BigDecimal("500")) > 0){
            return orcamento.getValor().multiply(new BigDecimal("0.05"));
        }
        return proximo.calcular(orcamento);
    }

}
