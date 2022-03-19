package br.com.daniloboccomino.status;

import br.com.daniloboccomino.Pedido;

public class EmailListener implements Listener {

    @Override
    public void update(Pedido pedido) {
        System.out.println("Enviando email do pedido " + pedido);
    }

}
