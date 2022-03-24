package br.com.daniloboccomino.status;

import br.com.daniloboccomino.IPedido;

public class LogListener implements Listener {

    @Override
    public void update(IPedido pedido) {
        System.out.println("Gravando log do pedido " + pedido);
    }

}
