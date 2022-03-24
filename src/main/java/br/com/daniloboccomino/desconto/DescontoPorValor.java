package br.com.daniloboccomino.desconto;

import br.com.daniloboccomino.IPedido;

import java.math.BigDecimal;

public class DescontoPorValor extends Desconto {

    public DescontoPorValor(Desconto proximo) {
        super(proximo);
    }

    @Override
    protected boolean aplicaDesconto(IPedido pedido) {
        return pedido.getValor().compareTo(new BigDecimal("500")) > 0;
    }

    @Override
    protected BigDecimal aplicarDesconto(IPedido pedido) {
        return pedido.getValor().multiply(new BigDecimal("0.1"));
    }

}
