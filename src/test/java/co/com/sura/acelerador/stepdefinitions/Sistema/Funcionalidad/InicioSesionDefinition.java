package co.com.sura.acelerador.stepdefinitions.Sistema.Funcionalidad;

import co.com.sura.acelerador.models.LoginData;
import co.com.sura.acelerador.tasks.Autenticar;
import co.com.sura.acelerador.tasks.Navegar;
import io.cucumber.java.Before;
import io.cucumber.java.DataTableType;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.serenitybdd.screenplay.ensure.Ensure;

import java.util.Map;

import static co.com.sura.acelerador.userinterfaces.PaginaPrincipal.PRODUCTS_TITLE;
import static net.serenitybdd.screenplay.actors.OnStage.*;

public class InicioSesionDefinition {
    private static final String USUARIO = "Usuario";
    private static final String HOME_PAGE_TITLE = "Products";

    @DataTableType
    public LoginData convert(Map<String, String> object){
        LoginData obj = new LoginData();

        obj.setUser(object.get("User") == null ? "" : object.get("User"));
        obj.setPassword(object.get("Password")== null ? "" : object.get("Password"));

        return obj;
    }

    @Before
    public void setUp(){
        setTheStage(new OnlineCast());
    }

    @Dado("que el usuario ingreso a Saucedemo")
    public void usuarioIngresaASaucedemo() {
        theActorCalled(USUARIO).wasAbleTo(
                Navegar.WebCarritoCompra()
        );
    }
    @Cuando("autentica con usuario y contrasena")
    public void autenticaConUsuarioYContrasena(LoginData loginData) {
        theActorInTheSpotlight().attemptsTo(
                Autenticar.con(loginData)
        );
    }
    @Entonces("el sistema debera mostrar la aplicacion homme")
    public void elSistemaMostraraHomme() {
        theActorInTheSpotlight().attemptsTo(
                Ensure.that(PRODUCTS_TITLE).textValues().contains(HOME_PAGE_TITLE)
        );
    }
}
