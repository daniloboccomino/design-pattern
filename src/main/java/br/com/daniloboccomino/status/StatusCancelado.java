package br.com.daniloboccomino.status;

import br.com.daniloboccomino.IPedido;

public class StatusCancelado extends Status {

    @Override
    public void abrirChamado(IPedido pedido) {
        System.out.println("Chamado para Comercial");
    }

    @Override
    public void reabrir(IPedido pedido) {
        pedido.setStatus(new StatusAberto());
    }

}
