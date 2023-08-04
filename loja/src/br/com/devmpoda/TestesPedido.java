package br.com.devmpoda;

import br.com.devmpoda.orcamento.Orcamento;
import br.com.devmpoda.orcamento.pedido.GeraPedido;
import br.com.devmpoda.orcamento.pedido.GeraPedidoHandler;
import br.com.devmpoda.orcamento.pedido.Pedido;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

public class TestesPedido {


    public static void main(String[] args) {
        String cliente = args[0];
        BigDecimal valorOrcamento = new BigDecimal(args[1]);
        int quantidadeItens = Integer.parseInt(args[2]);

        GeraPedido gerador = new GeraPedido(cliente, valorOrcamento, quantidadeItens);
        GeraPedidoHandler handler = new GeraPedidoHandler(/*dependencias*/);
    }
}
