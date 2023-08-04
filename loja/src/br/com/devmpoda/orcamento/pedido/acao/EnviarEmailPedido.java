package br.com.devmpoda.orcamento.pedido.acao;

import br.com.devmpoda.orcamento.pedido.Pedido;

public class EnviarEmailPedido implements AcaoAposGerarPedido{

    public void executarAcao(Pedido pedido) {
        System.out.println("Enviando email com dados do pedido!");
    }
}
