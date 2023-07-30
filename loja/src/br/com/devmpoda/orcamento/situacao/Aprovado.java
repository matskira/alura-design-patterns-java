package br.com.devmpoda.orcamento.situacao;

import br.com.devmpoda.DomainException;
import br.com.devmpoda.orcamento.Orcamento;

import java.math.BigDecimal;

public class Aprovado extends SituacaoOrcamento {

    @Override
    public BigDecimal calcularDescontoExtra(Orcamento orcamento) {
        return orcamento.getValor().multiply(new BigDecimal("0.02"));
    }

    @Override
    public void finalizar(Orcamento orcamento) throws DomainException {
        orcamento.setSituacao(new Finalizado());
    }

}
