package br.com.daniloboccomino.status;

import br.com.daniloboccomino.Pedido;

public class StatusAberto extends Status {

    @Override
    public void abrirChamado(Pedido pedido) {
        System.out.println("Chamado para financeiro");
    }

    @Override
    public void pagar(Pedido pedido) {
        pedido.setStatus(new StatusPago());
    }

    @Override
    public void cancelar(Pedido pedido) {
        pedido.setStatus(new StatusCancelado());
    }

}
