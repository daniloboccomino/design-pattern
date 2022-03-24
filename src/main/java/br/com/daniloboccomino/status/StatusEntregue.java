package br.com.daniloboccomino.status;

import br.com.daniloboccomino.IPedido;

public class StatusEntregue extends Status {

    @Override
    public void abrirChamado(IPedido pedido) {
        System.out.println("Chamado para Pos-Venda");
    }

}
