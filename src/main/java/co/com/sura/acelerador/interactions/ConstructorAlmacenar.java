package co.com.sura.acelerador.interactions;

import net.serenitybdd.screenplay.Performable;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class ConstructorAlmacenar {

    public Performable andResponse(){
        return instrumented(Almacenar.class);
    }
}
