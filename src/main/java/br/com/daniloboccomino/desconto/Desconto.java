package br.com.daniloboccomino.desconto;

import br.com.daniloboccomino.Pedido;

import java.math.BigDecimal;

public abstract class Desconto {

    protected Desconto proximo;

    public Desconto(Desconto proximo) {
        this.proximo = proximo;
    }

    public BigDecimal calcular(Pedido pedido) {
        // Template Method - metodo padrao com as etapas a serem seguidas
        // implementacao das subclasses define se alguma etapa possui implementacao especifica
        return aplicaDesconto(pedido) ? aplicarDesconto(pedido) : proximo.calcular(pedido);
    }

    protected abstract boolean aplicaDesconto(Pedido pedido);

    protected abstract BigDecimal aplicarDesconto(Pedido pedido);

}
