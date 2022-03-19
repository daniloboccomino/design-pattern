package br.com.daniloboccomino.status;

import br.com.daniloboccomino.Pedido;

public abstract class Status {

    // State - de acordo com o estado, o objeto possui comportamentos diferentes
    // implementacao das subclasses define quais os comportamentos e acoes

    public abstract void abrirChamado(Pedido pedido);

    public void pagar(Pedido pedido) {
        throw new StateException("Nao pode transitar para o status pago");
    }

    public void entregar(Pedido pedido) {
        throw new StateException("Nao pode transitar para o status entregue");
    }

    public void cancelar(Pedido pedido) {
        throw new StateException("Nao pode transitar para o status cancelado");
    }

    public void reabrir(Pedido pedido) {
        throw new StateException("Nao pode transitar para o status aberto");
    }

}
