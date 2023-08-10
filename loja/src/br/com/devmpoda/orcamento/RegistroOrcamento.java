package br.com.devmpoda.orcamento;

import br.com.devmpoda.DomainException;
import br.com.devmpoda.http.HttpAdapter;

import java.util.Map;

public class RegistroOrcamento {

    private HttpAdapter http;

    public RegistroOrcamento(HttpAdapter http) {
        this.http = http;
    }

    public void registrar(Orcamento orcamento) {
        if (!orcamento.isFinalizado()) {
            throw new DomainException("Orçamento não finalizado!");
        }
        // Aqui poderia ser um DAO, um serviço, etc.
        http.post("http://api.externa/orcamento", Map.of(
                "valor", orcamento.getValor(),
                "quantidadeItens", orcamento.getQuantidadeItens()
        ));
        System.out.println("Orçamento registrado!");
    }
}
