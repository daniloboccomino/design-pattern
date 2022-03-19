package br.com.daniloboccomino.status;

import br.com.daniloboccomino.Pedido;

import java.util.ArrayList;
import java.util.List;

public class StatusHandler {

    // Observer - mecanismo para notificar objetos sobre eventos

    private List<Listener> listeners;

    public StatusHandler() {
        this.listeners = new ArrayList<Listener>();
    }

    public void subscribe(Listener listener) {
        this.listeners.add(listener);
    }

    public void unsubscribe(Listener listener) {
        this.listeners.remove(listener);
    }

    public void notificar(Pedido pedido) {
        this.listeners.forEach(listener -> listener.update(pedido));
    }

}
