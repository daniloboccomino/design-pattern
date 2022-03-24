package br.com.daniloboccomino.imposto;

import br.com.daniloboccomino.IPedido;

import java.math.BigDecimal;

public interface Imposto {

    public BigDecimal calcular(IPedido pedido);

}
