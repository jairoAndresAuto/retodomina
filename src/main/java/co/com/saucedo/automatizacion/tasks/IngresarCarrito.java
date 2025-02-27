package co.com.saucedo.automatizacion.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static co.com.saucedo.automatizacion.userinterfaces.Compras.BTN_CARRITO;
import static co.com.saucedo.automatizacion.userinterfaces.Compras.BTN_REMOVER;
import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class IngresarCarrito implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(BTN_CARRITO),
                WaitUntil.the(BTN_REMOVER,isVisible()),
                Click.on(BTN_REMOVER));
    }

    public static IngresarCarrito eliminarProducto() {
        return instrumented(IngresarCarrito.class);
    }
}
