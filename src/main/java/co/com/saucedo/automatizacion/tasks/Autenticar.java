package co.com.saucedo.automatizacion.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.ui.Button;

import static co.com.saucedo.automatizacion.userinterfaces.Acceso.PASSWORD_FIELD;
import static co.com.saucedo.automatizacion.userinterfaces.Acceso.USER_FIELD;
import static co.com.saucedo.automatizacion.util.Constantes.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class Autenticar implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(USER).into(USER_FIELD),
                Enter.theValue(CLAVE).into(PASSWORD_FIELD),
                Click.on(Button.withText(LOGIN))
        );
    }

    public static Autenticar enLaAplicacion() {
        return instrumented(Autenticar.class);
    }
}

