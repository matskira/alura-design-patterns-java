package br.com.devmpoda.orcamento.pedido.acao;

import br.com.devmpoda.orcamento.pedido.Pedido;

public class SalvarPedidoNoBancoDeDados implements AcaoAposGerarPedido {

    public void executarAcao(Pedido pedido) {
        System.out.println("Salvando pedido no banco de dados!");
    }
}
