package co.com.saucedo.automatizacion.tasks;

import com.github.javafaker.Faker;
import lombok.AllArgsConstructor;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import java.util.Locale;

import static co.com.saucedo.automatizacion.userinterfaces.Compras.BTN_AGREGAR;
import static net.serenitybdd.screenplay.Tasks.instrumented;

@AllArgsConstructor
public class RealizarCompra implements Task {

    private String producto;

    @Override
    public <T extends Actor> void performAs(T actor) {
        Faker faker = new Faker(new Locale("en_ES"));
        if (producto.equals("Sauce Labs Bike Light")){
            BTN_AGREGAR.resolveAllFor(actor).get(1).click();
        }else{
            BTN_AGREGAR.resolveAllFor(actor).get(faker.random().nextInt(2,5)).click();
        }

    }

    public static RealizarCompra productos(String producto) {
        return instrumented(RealizarCompra.class,producto);
    }
}
