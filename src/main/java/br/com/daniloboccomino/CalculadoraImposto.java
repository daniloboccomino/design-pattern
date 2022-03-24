package br.com.daniloboccomino;

import br.com.daniloboccomino.imposto.Imposto;

import java.math.BigDecimal;

public class CalculadoraImposto {

    private Imposto imposto;

    public CalculadoraImposto(Imposto imposto) {
        this.imposto = imposto;
    }

    public BigDecimal calcular(IPedido pedido) {
        return imposto.calcular(pedido);
    }

    public Imposto getImposto() {
        return imposto;
    }

    public void setImposto(Imposto imposto) {
        this.imposto = imposto;
    }

}
