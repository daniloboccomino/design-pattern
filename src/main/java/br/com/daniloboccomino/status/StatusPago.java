package br.com.daniloboccomino.status;

import br.com.daniloboccomino.IPedido;

public class StatusPago extends Status {

    @Override
    public void abrirChamado(IPedido pedido) {
        System.out.println("Chamado para logistica");
    }

    @Override
    public void entregar(IPedido pedido) {
        pedido.setStatus(new StatusEntregue());
    }

    @Override
    public void cancelar(IPedido pedido) {
        pedido.setStatus(new StatusCancelado());
    }
}
