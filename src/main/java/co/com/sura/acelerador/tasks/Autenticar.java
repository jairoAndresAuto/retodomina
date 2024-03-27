package co.com.sura.acelerador.tasks;

import co.com.sura.acelerador.models.LoginData;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.ui.Button;

import static co.com.sura.acelerador.userinterfaces.Acceso.PASSWORD_FIELD;
import static co.com.sura.acelerador.userinterfaces.Acceso.USER_FIELD;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class Autenticar implements Task {

    private LoginData loginData;

    public Autenticar(LoginData loginData) {
        this.loginData = loginData;
    }

    public static Performable with(LoginData loginData) {
        return instrumented(Autenticar.class, loginData);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(loginData.getUser()).into(USER_FIELD),
                Enter.theValue(loginData.getPassword()).into(PASSWORD_FIELD),
                Click.on(Button.withText("LOGIN"))
        );
    }
}

