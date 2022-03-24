package br.com.daniloboccomino.desconto;

import br.com.daniloboccomino.IPedido;

import java.math.BigDecimal;

public class DescontoZero extends Desconto {

    public DescontoZero() {
        super(null);
    }

    @Override
    protected boolean aplicaDesconto(IPedido pedido) {
        return true;
    }

    @Override
    protected BigDecimal aplicarDesconto(IPedido pedido) {
        return BigDecimal.ZERO;
    }

}
