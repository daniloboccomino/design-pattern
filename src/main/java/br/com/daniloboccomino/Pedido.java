package br.com.daniloboccomino;

import br.com.daniloboccomino.status.Status;
import br.com.daniloboccomino.status.StatusAberto;
import br.com.daniloboccomino.status.StatusHandler;

import java.math.BigDecimal;

public class Pedido implements IPedido {

    private BigDecimal valor;
    private int quantidadeItens;
    private Status status;
    private StatusHandler handler;

    public Pedido(BigDecimal valor) {
        this.valor = valor;
        this.quantidadeItens = 1;
        this.status = new StatusAberto();
        this.handler = new StatusHandler();
    }

    public Pedido(BigDecimal valor, int quantidadeItens) {
        this.valor = valor;
        this.quantidadeItens = quantidadeItens;
        this.status = new StatusAberto();
        this.handler = new StatusHandler();
    }

    @Override
    public BigDecimal getValor() {
        // simular uma operacao lazy para implementar o proxy
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return valor;
    }

    @Override
    public void setValor(BigDecimal valor) {
        this.valor = valor;
    }

    @Override
    public int getQuantidadeItens() {
        return quantidadeItens;
    }

    @Override
    public void setQuantidadeItens(int quantidadeItens) {
        this.quantidadeItens = quantidadeItens;
    }

    @Override
    public Status getStatus() {
        return status;
    }

    @Override
    public void setStatus(Status status) {
        this.status = status;
        this.handler.notificar(this);
    }

    @Override
    public void abrirChamado() {
        this.status.abrirChamado(this);
    }

    @Override
    public void pagar() {
        this.status.pagar(this);
    }

    @Override
    public void entregar() {
        this.status.entregar(this);
    }

    @Override
    public void cancelar() {
        this.status.cancelar(this);
    }

    @Override
    public void reabrir() {
        this.status.reabrir(this);
    }

    @Override
    public StatusHandler getHandler() {
        return handler;
    }

    @Override
    public void setHandler(StatusHandler handler) {
        this.handler = handler;
    }

}
