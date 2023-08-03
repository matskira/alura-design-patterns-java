package br.com.devmpoda;

import br.com.devmpoda.orcamento.Orcamento;
import br.com.devmpoda.orcamento.pedido.Pedido;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public class TestesPedido {

    public static void main(String[] args) {
        Orcamento orcamento = new Orcamento(new BigDecimal("600"), 4);
        String cliente = "Matheus Poda";
        LocalDateTime data = LocalDateTime.now();

        Pedido pedido = new Pedido(cliente, data, orcamento);

        //Execução de comandos vai sempre ficar repetida;
        System.out.println("Salvar pedido no Banco de Dados");
        System.out.println("Enviar e-mail com dados do novo pedido");

    }
}
