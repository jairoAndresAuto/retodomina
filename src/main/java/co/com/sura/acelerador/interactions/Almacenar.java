package co.com.sura.acelerador.interactions;

import co.com.sura.acelerador.models.CuentasPojo;
import net.serenitybdd.rest.SerenityRest;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;

import static co.com.sura.acelerador.util.Constantes.*;

public class Almacenar implements Interaction {


    public static ConstructorAlmacenar statusCode(){
        return new ConstructorAlmacenar();
    }

    @Override
    public  <T extends Actor> void performAs(T actor){
        actor.remember(STATUS_CODE_RESPONSE, SerenityRest.lastResponse().getStatusCode());

        if(SerenityRest.lastResponse().getStatusCode() == STATUS_CODE_INTERNAL_SUCCESS){
            actor.remember(RESP_CREATE_ACCOUNT, SerenityRest.lastResponse().jsonPath().getObject("", CuentasPojo.class));
        }
    }
}
