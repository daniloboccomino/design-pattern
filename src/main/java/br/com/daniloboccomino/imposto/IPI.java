package br.com.daniloboccomino.imposto;

import br.com.daniloboccomino.IPedido;

import java.math.BigDecimal;

public class IPI implements Imposto {

    @Override
    public BigDecimal calcular(IPedido pedido) {
        return pedido.getValor().multiply(new BigDecimal("0.06"));
    }

}
