package br.com.daniloboccomino;

import br.com.daniloboccomino.status.Status;
import br.com.daniloboccomino.status.StatusAberto;
import br.com.daniloboccomino.status.StatusHandler;

import java.math.BigDecimal;

public class Pedido {

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

    public BigDecimal getValor() {
        return valor;
    }

    public void setValor(BigDecimal valor) {
        this.valor = valor;
    }

    public int getQuantidadeItens() {
        return quantidadeItens;
    }

    public void setQuantidadeItens(int quantidadeItens) {
        this.quantidadeItens = quantidadeItens;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
        this.handler.notificar(this);
    }

    public void abrirChamado() {
        this.status.abrirChamado(this);
    }

    public void pagar() {
        this.status.pagar(this);
    }

    public void entregar() {
        this.status.entregar(this);
    }

    public void cancelar() {
        this.status.cancelar(this);
    }

    public void reabrir() {
        this.status.reabrir(this);
    }

    public StatusHandler getHandler() {
        return handler;
    }

    public void setHandler(StatusHandler handler) {
        this.handler = handler;
    }

}
