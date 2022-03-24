package br.com.daniloboccomino.desconto;

import br.com.daniloboccomino.IPedido;

import java.math.BigDecimal;

public class DescontoPorQuantidadeItens extends Desconto {

    public DescontoPorQuantidadeItens(Desconto proximo) {
        super(proximo);
    }

    @Override
    protected boolean aplicaDesconto(IPedido pedido) {
        return pedido.getQuantidadeItens() > 10;
    }

    @Override
    protected BigDecimal aplicarDesconto(IPedido pedido) {
        return pedido.getValor().multiply(new BigDecimal("0.05"));
    }

}
