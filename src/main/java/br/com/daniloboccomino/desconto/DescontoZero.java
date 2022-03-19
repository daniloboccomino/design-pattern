package br.com.daniloboccomino.desconto;

import br.com.daniloboccomino.Pedido;

import java.math.BigDecimal;

public class DescontoZero extends Desconto {

    public DescontoZero() {
        super(null);
    }

    @Override
    protected boolean aplicaDesconto(Pedido pedido) {
        return true;
    }

    @Override
    protected BigDecimal aplicarDesconto(Pedido pedido) {
        return BigDecimal.ZERO;
    }

}
