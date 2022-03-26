package br.com.daniloboccomino.status;

import br.com.daniloboccomino.IPedido;

public class StatusAberto extends Status {

    @Override
    public void abrirChamado(IPedido pedido) {
        // Facade - interface que resolve os servicos complexos que acontecem por de baixo dos panos
        StatusFacade.abrirChamado();
        System.out.println("Chamado para financeiro");
    }

    @Override
    public void pagar(IPedido pedido) {
        pedido.setStatus(new StatusPago());
    }

    @Override
    public void cancelar(IPedido pedido) {
        pedido.setStatus(new StatusCancelado());
    }

}
