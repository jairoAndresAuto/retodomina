package co.com.sura.acelerador.tasks;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class GenerarSolicitudes {
    private String accountNumber;
    private String accountType;

    public GenerarSolicitudes conCuenta(String accountNumber){
        this.accountNumber = accountNumber;
        return this;
    }

    public GenerarSolicitudes deTipo(String accountType){
        this.accountType = accountType;
        return this;
    }

    public Generar Y(String clientId){
        return instrumented(Generar.class, accountNumber, accountType, clientId);
    }
}
