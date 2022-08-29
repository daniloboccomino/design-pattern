package br.com.daniloboccomino.imposto;

import br.com.daniloboccomino.IPedido;

import java.math.BigDecimal;

public abstract class Imposto {

    protected Imposto proximoImposto;

    // Decorator - construtor com objeto do mesmo tipo para montar a pilha de objetos/comportamentos
    public Imposto(Imposto imposto) {
        super();
        this.proximoImposto = imposto;
    }

    public BigDecimal calcular(IPedido pedido) {
        // Template Method - metodo padrao com as etapas a serem seguidas
        // implementacao das subclasses define se alguma etapa possui implementacao especifica
        BigDecimal valorImposto = aplicarImposto(pedido);
        // Decorator - verifica se a pilha de objetos/comportamentos possui mais um nivel
        return valorImposto.add(this.proximoImposto != null ? this.proximoImposto.calcular(pedido) : BigDecimal.ZERO);
    }

    protected abstract BigDecimal aplicarImposto(IPedido pedido);

}
