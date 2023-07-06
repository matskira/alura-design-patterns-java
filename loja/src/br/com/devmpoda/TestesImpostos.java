package br.com.devmpoda;

import br.com.devmpoda.imposto.CalculadoraDeImpostos;
import br.com.devmpoda.imposto.TipoImposto;

import java.math.BigDecimal;

public class TestesImpostos {

    public static void main(String[] args) {
        Orcamento orcamento = new Orcamento(new BigDecimal("100"));
        CalculadoraDeImpostos calculadoraDeImpostos = new CalculadoraDeImpostos();

        System.out.println(calculadoraDeImpostos.calcular(orcamento, TipoImposto.ISS));
    }
}
