package br.com.daniloboccomino.imposto;

import br.com.daniloboccomino.IPedido;

import java.math.BigDecimal;

public class ICMS extends Imposto {

    public ICMS(Imposto imposto) {
        super(imposto);
    }

    @Override
    public BigDecimal calcular(IPedido pedido) {
        BigDecimal valorImposto = pedido.getValor().multiply(new BigDecimal("0.1"));
        // Decorator - verifica se a pilha de objetos/comportamentos possui mais um nivel
        BigDecimal valorOutroImposto = this.imposto != null ? this.imposto.calcular(pedido) : BigDecimal.ZERO;
        return valorImposto.add(valorOutroImposto);
    }

}
