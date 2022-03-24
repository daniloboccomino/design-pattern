package br.com.daniloboccomino;

import br.com.daniloboccomino.imposto.ICMS;

import java.math.BigDecimal;

public class CalculadoraImpostoTest {

    public static void main(String[] args) {
        CalculadoraImposto calculadoraImposto = new CalculadoraImposto(new ICMS()); // Strategy - resolver o problema passando a estrategia a ser usada
        IPedido pedido = new Pedido(new BigDecimal("100"));

        BigDecimal imposto = calculadoraImposto.calcular(pedido);
        System.out.println(imposto);
    }

}
