package br.com.daniloboccomino.desconto;

import br.com.daniloboccomino.Pedido;

import java.math.BigDecimal;

public class DescontoPorQuantidadeItens extends Desconto {

    public DescontoPorQuantidadeItens(Desconto proximo) {
        super(proximo);
    }

    @Override
    public BigDecimal calcular(Pedido pedido) {
        if (pedido.getQuantidadeItens() > 10) {
            return pedido.getValor().multiply(new BigDecimal("0.05"));
        }
        return proximo.calcular(pedido);
    }

}
