package co.com.sura.acelerador.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Open;

import static co.com.sura.acelerador.util.Constantes.SHOPING_CART_URL;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class Navegar implements Task {

    private String url;

    public Navegar(String url) {
        this.url = url;
    }

    public static Performable ShopingCartWeb() {
        return instrumented(Navegar.class, SHOPING_CART_URL);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Open.url(url));
    }
}
