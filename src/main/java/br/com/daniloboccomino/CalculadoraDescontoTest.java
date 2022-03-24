package br.com.daniloboccomino;

import java.math.BigDecimal;

public class CalculadoraDescontoTest {

    public static void main(String[] args) {
        CalculadoraDesconto calculadoraDesconto = new CalculadoraDesconto();
        IPedido pedido = new Pedido(new BigDecimal("100"),5);

        BigDecimal desconto = calculadoraDesconto.calcular(pedido);
        System.out.println(desconto);
    }

}
