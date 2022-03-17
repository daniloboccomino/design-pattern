package br.com.daniloboccomino;

import java.math.BigDecimal;

public class Pedido {

    private BigDecimal valor;

    public Pedido(BigDecimal valor) {
        this.valor = valor;
    }

    public BigDecimal getValor() {
        return valor;
    }

    public void setValor(BigDecimal valor) {
        this.valor = valor;
    }

}
