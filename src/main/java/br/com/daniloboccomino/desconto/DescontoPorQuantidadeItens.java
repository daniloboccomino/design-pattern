package br.com.daniloboccomino.desconto;

import br.com.daniloboccomino.Pedido;

import java.math.BigDecimal;

public class DescontoPorQuantidadeItens extends Desconto {

    public DescontoPorQuantidadeItens(Desconto proximo) {
        super(proximo);
    }

    @Override
    protected boolean aplicaDesconto(Pedido pedido) {
        return pedido.getQuantidadeItens() > 10;
    }

    @Override
    protected BigDecimal aplicarDesconto(Pedido pedido) {
        return pedido.getValor().multiply(new BigDecimal("0.05"));
    }

}
