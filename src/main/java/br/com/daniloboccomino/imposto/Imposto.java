package br.com.daniloboccomino.imposto;

import br.com.daniloboccomino.IPedido;

import java.math.BigDecimal;

public abstract class Imposto {

    protected Imposto imposto;

    // Decorator - construtor com objeto do mesmo tipo para montar a pilha de objetos/comportamentos
    public Imposto(Imposto imposto) {
        super();
        this.imposto = imposto;
    }

    public abstract BigDecimal calcular(IPedido pedido);

}
