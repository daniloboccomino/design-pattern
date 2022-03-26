package br.com.daniloboccomino;

import br.com.daniloboccomino.imposto.ICMS;
import br.com.daniloboccomino.imposto.IPI;
import br.com.daniloboccomino.imposto.ISS;

import java.math.BigDecimal;

public class CalculadoraImpostoTest {

    public static void main(String[] args) {
        CalculadoraImposto calculadoraImposto = new CalculadoraImposto(
                                                new ICMS(
                                                new ISS(
                                                new IPI(null
                                                )))); // Strategy - resolver o problema passando a estrategia a ser usada
        IPedido pedido = new PedidoProxy(new Pedido(new BigDecimal("100")));

        BigDecimal imposto = calculadoraImposto.calcular(pedido);
        System.out.println(imposto);
    }

}
