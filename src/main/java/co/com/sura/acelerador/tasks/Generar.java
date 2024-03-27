package co.com.sura.acelerador.tasks;

import co.com.sura.acelerador.interactions.Almacenar;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.rest.interactions.Post;

import static co.com.sura.acelerador.util.Constantes.API_CREATE_ACCOUNT;
import static co.com.sura.acelerador.enums.EncabezadoParametros.AUTHORIZATION;
import static co.com.sura.acelerador.enums.EncabezadoParametros.CONTENT_TYPE_APPLICATION_JSON;

public class Generar implements Task {

    private String accountNumber;
    private String accountType;
    String clientId;

    public Generar(String accountNumber, String accountType, String clientId){
        this.accountNumber = accountNumber;
        this.accountType = accountType;
        this.clientId = clientId;
    }

    public static GenerarSolicitudes createAccount(){
        return new GenerarSolicitudes();
    }

    @Override
    public <T extends Actor> void performAs(T actor){
        actor.attemptsTo(
                Post.to(String .format(API_CREATE_ACCOUNT,clientId,accountType,accountNumber))
                    .with(request -> request
                            .header(AUTHORIZATION.getKey(), AUTHORIZATION.getValue())
                            .header(CONTENT_TYPE_APPLICATION_JSON.getKey(), CONTENT_TYPE_APPLICATION_JSON.getValue())
                            .request().log().all()
                    ),
                Almacenar.statusCode().andResponse()
        );
    }
}
