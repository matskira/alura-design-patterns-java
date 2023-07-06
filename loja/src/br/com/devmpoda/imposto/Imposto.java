package br.com.devmpoda.imposto;

import br.com.devmpoda.Orcamento;

import java.math.BigDecimal;

public interface Imposto {

    BigDecimal calcular(Orcamento valor);
}
