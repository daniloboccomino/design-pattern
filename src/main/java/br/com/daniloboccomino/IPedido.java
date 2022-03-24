package br.com.daniloboccomino;

import br.com.daniloboccomino.status.Status;
import br.com.daniloboccomino.status.StatusHandler;

import java.math.BigDecimal;

public interface IPedido {
    BigDecimal getValor();

    void setValor(BigDecimal valor);

    int getQuantidadeItens();

    void setQuantidadeItens(int quantidadeItens);

    Status getStatus();

    void setStatus(Status status);

    void abrirChamado();

    void pagar();

    void entregar();

    void cancelar();

    void reabrir();

    StatusHandler getHandler();

    void setHandler(StatusHandler handler);
}
