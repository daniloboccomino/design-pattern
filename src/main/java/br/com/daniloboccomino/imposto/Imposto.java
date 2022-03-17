package br.com.daniloboccomino.imposto;

import br.com.daniloboccomino.Pedido;

import java.math.BigDecimal;

public interface Imposto {

    public BigDecimal calcular(Pedido pedido);

}
