package br.com.devmpoda;

import br.com.devmpoda.descontos.CalculadoraDeDescontos;
import br.com.devmpoda.imposto.CalculadoraDeImpostos;
import br.com.devmpoda.imposto.ICMS;
import br.com.devmpoda.imposto.ISS;

import java.math.BigDecimal;

public class TestesDescontos {

    public static void main(String[] args) {
        Orcamento orcamento = new Orcamento(new BigDecimal("200"),6);
        Orcamento segundoOrcamento = new Orcamento(new BigDecimal("1000"),1);

        CalculadoraDeDescontos calculadoraDeDescontos = new CalculadoraDeDescontos();
        System.out.println(calculadoraDeDescontos.calcular(orcamento));
        System.out.println(calculadoraDeDescontos.calcular(segundoOrcamento));

    }
}
