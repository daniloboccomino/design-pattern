package br.com.daniloboccomino.status;

import br.com.daniloboccomino.IPedido;

public abstract class Status {

    // State - de acordo com o estado, o objeto possui comportamentos diferentes
    // implementacao das subclasses define quais os comportamentos e acoes

    public abstract void abrirChamado(IPedido pedido);

    public void pagar(IPedido pedido) {
        throw new StateException("Nao pode transitar para o status pago");
    }

    public void entregar(IPedido pedido) {
        throw new StateException("Nao pode transitar para o status entregue");
    }

    public void cancelar(IPedido pedido) {
        throw new StateException("Nao pode transitar para o status cancelado");
    }

    public void reabrir(IPedido pedido) {
        throw new StateException("Nao pode transitar para o status aberto");
    }

}
