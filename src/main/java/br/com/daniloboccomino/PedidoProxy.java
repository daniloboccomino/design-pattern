package br.com.daniloboccomino;

import br.com.daniloboccomino.status.Status;
import br.com.daniloboccomino.status.StatusHandler;

import java.math.BigDecimal;

public class PedidoProxy implements IPedido {

    private IPedido pedido;
    private BigDecimal valor;

    public PedidoProxy(IPedido pedido) {
        super();
        this.pedido = pedido;
    }

    @Override
    public BigDecimal getValor() {
        // Proxy - recupera o valor do objeto original e armazena em cache/memoria
        // o proxy devolve o proprio valor nas requisicoes seguintes
        // sem a necessidade de consultar o objeto original
        if (this.valor == null) {
            this.valor = this.pedido.getValor();
        }
        return this.valor;
    }

    @Override
    public void setValor(BigDecimal valor) {
        pedido.setValor(valor);
    }

    @Override
    public int getQuantidadeItens() {
        return this.pedido.getQuantidadeItens();
    }

    @Override
    public void setQuantidadeItens(int quantidadeItens) {
        pedido.setQuantidadeItens(quantidadeItens);
    }

    @Override
    public Status getStatus() {
        return this.pedido.getStatus();
    }

    @Override
    public void setStatus(Status status) {
        pedido.setStatus(status);
    }

    @Override
    public void abrirChamado() {
        pedido.abrirChamado();
    }

    @Override
    public void pagar() {
        pedido.pagar();
    }

    @Override
    public void entregar() {
        pedido.entregar();
    }

    @Override
    public void cancelar() {
        pedido.cancelar();
    }

    @Override
    public void reabrir() {
        pedido.reabrir();
    }

    @Override
    public StatusHandler getHandler() {
        return this.pedido.getHandler();
    }

    @Override
    public void setHandler(StatusHandler handler) {
        pedido.setHandler(handler);
    }

}
