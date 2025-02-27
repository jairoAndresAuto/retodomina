package co.com.saucedo.automatizacion.tasks;

import com.github.javafaker.Faker;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.waits.WaitUntil;

import java.util.Locale;

import static co.com.saucedo.automatizacion.userinterfaces.Compras.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class RealizarCheckout implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        Faker faker = new Faker(new Locale("en_ES"));
        actor.attemptsTo(Click.on(BTN_CHECKOUT),
                Enter.theValue(faker.name().firstName()).into(TXT_PRIMER_NOMBRE),
                Enter.theValue(faker.name().lastName()).into(TXT_PRIMER_APELLIDO),
                Enter.theValue("05001").into(TXT_CODIGO_POSTAL),
                Click.on(BTN_CONTINUAR),
                WaitUntil.the(BTN_FINALIZAR,isVisible()),
                Click.on(BTN_FINALIZAR),
                WaitUntil.the(LBL_MENSAJE,isVisible()));
    }

    public static RealizarCheckout compra() {
        return instrumented(RealizarCheckout.class);
    }
}
