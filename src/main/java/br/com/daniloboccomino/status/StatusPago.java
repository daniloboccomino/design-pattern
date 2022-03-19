package br.com.daniloboccomino.status;

import br.com.daniloboccomino.Pedido;

public class StatusPago extends Status {

    @Override
    public void abrirChamado(Pedido pedido) {
        System.out.println("Chamado para logistica");
    }

    @Override
    public void entregar(Pedido pedido) {
        pedido.setStatus(new StatusEntregue());
    }

    @Override
    public void cancelar(Pedido pedido) {
        pedido.setStatus(new StatusCancelado());
    }
}
