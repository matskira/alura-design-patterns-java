package br.com.devmpoda.orcamento.pedido;

import br.com.devmpoda.orcamento.Orcamento;

import java.time.LocalDateTime;

public class GeraPedidoHandler {

    //construtor com injeção de dependencia: repository, service, etc;

    public void execute(GeraPedido dados){
        Orcamento orcamento = new Orcamento(dados.getValorOrcamento(), dados.getQuantidadeItens());

        Pedido pedido = new Pedido(dados.getCliente(), LocalDateTime.now(), orcamento);

        //Execução de comandos vai sempre ficar repetida;
        System.out.println("Salvar pedido no Banco de Dados");
        System.out.println("Enviar e-mail com dados do novo pedido");
    }
}
