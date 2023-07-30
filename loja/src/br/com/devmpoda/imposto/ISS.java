package br.com.devmpoda.imposto;

import br.com.devmpoda.orcamento.Orcamento;

import java.math.BigDecimal;

public class ISS implements Imposto{

    public BigDecimal calcular(Orcamento orcamento) {
        return orcamento.getValor().multiply(new BigDecimal("0.06"));
    }
}
