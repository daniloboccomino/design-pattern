package br.com.daniloboccomino.status;

import br.com.daniloboccomino.Pedido;

public class StatusEntregue extends Status {

    @Override
    public void abrirChamado(Pedido pedido) {
        System.out.println("Chamado para Pos-Venda");
    }

}
