package br.com.devmpoda;

import br.com.devmpoda.http.JavaHttpClient;
import br.com.devmpoda.orcamento.Orcamento;
import br.com.devmpoda.orcamento.RegistroOrcamento;

import java.math.BigDecimal;

public class TesteAdapter {

    public static void main(String[] args) {
        Orcamento orcamento = new Orcamento(BigDecimal.TEN,1);
        orcamento.aprovar();
        orcamento.finalizar();
        RegistroOrcamento registroOrcamento = new RegistroOrcamento(new JavaHttpClient());
        registroOrcamento.registrar(orcamento);
    }
}
