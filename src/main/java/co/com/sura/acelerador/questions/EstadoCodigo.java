package co.com.sura.acelerador.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import static co.com.sura.acelerador.util.Constantes.STATUS_CODE_RESPONSE;

public class EstadoCodigo implements Question<Boolean> {

    private int statusCode;

    public EstadoCodigo(int statusCode){
        this.statusCode = statusCode;
    }
    public static EstadoCodigo is(int statusCode){
        return new EstadoCodigo(statusCode);
    }

    @Override
    public Boolean answeredBy(Actor actor){
        return actor.recall(STATUS_CODE_RESPONSE).equals(statusCode);
    }
}
