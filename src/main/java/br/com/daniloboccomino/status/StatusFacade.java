package br.com.daniloboccomino.status;

public class StatusFacade {

    public static void abrirChamado() {
        // simulando chamadas de outros subsistemas
        System.out.println("Sistema de Consulta de suporte");
        System.out.println("Sistema de Registro de chamado no CRM");
        // sistemas de notificacao poderiam ser um outro Facade caso fossem complexos
        System.out.println("Sistema de Notificacao do gerente");
        System.out.println("Sistema de Notificacao do cliente");
    }

}
