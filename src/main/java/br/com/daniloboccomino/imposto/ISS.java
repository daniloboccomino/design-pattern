package br.com.daniloboccomino.imposto;

import br.com.daniloboccomino.IPedido;

import java.math.BigDecimal;

public class ISS extends Imposto {

    public ISS(Imposto imposto) {
        super(imposto);
    }

    @Override
    protected BigDecimal aplicarImposto(IPedido pedido) {
        return pedido.getValor().multiply(new BigDecimal("0.05"));
    }

}
