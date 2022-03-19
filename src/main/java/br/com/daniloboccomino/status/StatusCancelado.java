package br.com.daniloboccomino.status;

import br.com.daniloboccomino.Pedido;

public class StatusCancelado extends Status {

    @Override
    public void abrirChamado(Pedido pedido) {
        System.out.println("Chamado para Comercial");
    }

    @Override
    public void reabrir(Pedido pedido) {
        pedido.setStatus(new StatusAberto());
    }

}
