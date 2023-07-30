package br.com.devmpoda.orcamento.situacao;

import br.com.devmpoda.DomainException;
import br.com.devmpoda.orcamento.Orcamento;

import java.math.BigDecimal;

public class Finalizado extends SituacaoOrcamento {

    @Override
    public BigDecimal calcularDescontoExtra(Orcamento orcamento) {
        throw new DomainException("Orcamento finalizado nao pode ter desconto extra!");
    }

}
