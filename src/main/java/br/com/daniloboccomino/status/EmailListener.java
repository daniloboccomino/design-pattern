package br.com.daniloboccomino.status;

import br.com.daniloboccomino.IPedido;

public class EmailListener implements Listener {

    @Override
    public void update(IPedido pedido) {
        System.out.println("Enviando email do pedido " + pedido);
    }

}
