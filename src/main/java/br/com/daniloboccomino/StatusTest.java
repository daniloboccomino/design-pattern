package br.com.daniloboccomino;

import java.math.BigDecimal;

public class StatusTest {

    public static void main(String[] args) {
        Pedido pedido = new Pedido(new BigDecimal("100"));
        pedido.abrirChamado();

        pedido.pagar();
        System.out.println(pedido.getStatus());
        pedido.abrirChamado();

        pedido.entregar();
        System.out.println(pedido.getStatus());
        pedido.abrirChamado();
    }

}
