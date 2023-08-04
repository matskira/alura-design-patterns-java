package br.com.devmpoda.orcamento.pedido.acao;

import br.com.devmpoda.orcamento.pedido.Pedido;

public class EnviarEmailPedido {

    public void executar(Pedido pedido) {
        System.out.println("Enviando email com dados do pedido!");
    }
}
