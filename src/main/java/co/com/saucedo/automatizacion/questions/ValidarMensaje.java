package co.com.saucedo.automatizacion.questions;

import lombok.AllArgsConstructor;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

@AllArgsConstructor
public class ValidarMensaje implements Question<Boolean> {

    private String obtenido;
    private String esperado;

    @Override
    public Boolean answeredBy(Actor actor) {
        return obtenido.equals(esperado) ;
    }

    public static ValidarMensaje deElementos(String obtenido,String esperado) {
        return new ValidarMensaje(obtenido,esperado);
    }
}
