package br.com.daniloboccomino;

import br.com.daniloboccomino.status.EmailListener;
import br.com.daniloboccomino.status.LogListener;

import java.math.BigDecimal;

public class StatusTest {

    public static void main(String[] args) {
        Pedido pedido = new Pedido(new BigDecimal("100"));
        pedido.getHandler().subscribe(new EmailListener());
        pedido.getHandler().subscribe(new LogListener());
        pedido.abrirChamado();

        pedido.pagar();
        System.out.println(pedido.getStatus());
        pedido.abrirChamado();

        pedido.entregar();
        System.out.println(pedido.getStatus());
        pedido.abrirChamado();
    }

}
