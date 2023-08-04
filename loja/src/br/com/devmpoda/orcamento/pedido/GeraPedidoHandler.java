package br.com.devmpoda.orcamento.pedido;

import br.com.devmpoda.orcamento.Orcamento;
import br.com.devmpoda.orcamento.pedido.acao.EnviarEmailPedido;
import br.com.devmpoda.orcamento.pedido.acao.SalvarPedidoNoBancoDeDados;

import java.time.LocalDateTime;

public class GeraPedidoHandler {

    //construtor com injeção de dependencia: repository, service, etc;

    public void execute(GeraPedido dados){
        Orcamento orcamento = new Orcamento(dados.getValorOrcamento(), dados.getQuantidadeItens());

        Pedido pedido = new Pedido(dados.getCliente(), LocalDateTime.now(), orcamento);

        //Execução de comandos vai sempre ficar repetida;
        EnviarEmailPedido email = new EnviarEmailPedido();
        SalvarPedidoNoBancoDeDados salvar = new SalvarPedidoNoBancoDeDados();

        email.executar(pedido);
        salvar.executar(pedido);
    }
}
