package co.com.saucedo.automatizacion.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import static co.com.saucedo.automatizacion.userinterfaces.Compras.BTN_LOGOUT;
import static co.com.saucedo.automatizacion.userinterfaces.Compras.BTN_MENU;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class CerrarSesion implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(BTN_MENU),
                Click.on(BTN_LOGOUT));
    }

    public static CerrarSesion app() {
        return instrumented(CerrarSesion.class);
    }
}
