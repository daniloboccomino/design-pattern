package br.com.daniloboccomino.imposto;

import br.com.daniloboccomino.IPedido;

import java.math.BigDecimal;

public class ICMS extends Imposto {

    public ICMS(Imposto imposto) {
        super(imposto);
    }

    @Override
    protected BigDecimal aplicarImposto(IPedido pedido) {
        return pedido.getValor().multiply(new BigDecimal("0.1"));
    }

}
