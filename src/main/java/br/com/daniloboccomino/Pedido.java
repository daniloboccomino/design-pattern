package br.com.daniloboccomino;

import java.math.BigDecimal;

public class Pedido {

    private BigDecimal valor;
    private int quantidadeItens;

    public Pedido(BigDecimal valor) {
        this.valor = valor;
        this.quantidadeItens = 1;
    }

    public Pedido(BigDecimal valor, int quantidadeItens) {
        this.valor = valor;
        this.quantidadeItens = quantidadeItens;
    }

    public BigDecimal getValor() {
        return valor;
    }

    public void setValor(BigDecimal valor) {
        this.valor = valor;
    }

    public int getQuantidadeItens() {
        return quantidadeItens;
    }

    public void setQuantidadeItens(int quantidadeItens) {
        this.quantidadeItens = quantidadeItens;
    }

}
