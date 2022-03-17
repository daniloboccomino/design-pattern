package br.com.daniloboccomino.imposto;

import br.com.daniloboccomino.Pedido;

import java.math.BigDecimal;

public class ICMS implements Imposto {

    @Override
    public BigDecimal calcular(Pedido pedido) {
        return pedido.getValor().multiply(new BigDecimal("0.1"));
    }

}
