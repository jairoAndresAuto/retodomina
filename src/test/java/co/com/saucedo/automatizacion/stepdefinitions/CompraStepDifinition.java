package co.com.saucedo.automatizacion.stepdefinitions;

import co.com.saucedo.automatizacion.questions.ValidarMensaje;
import co.com.saucedo.automatizacion.tasks.*;
import io.cucumber.java.Before;
import io.cucumber.java.es.*;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnlineCast;

import static co.com.saucedo.automatizacion.userinterfaces.Compras.LBL_MENSAJE;
import static co.com.saucedo.automatizacion.util.Constantes.SHOPING_CART_URL;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.*;

public class CompraStepDifinition {


    @Before
    public void setUp() {
        setTheStage(new OnlineCast());
    }

    @Dado("que el usuario ingreso a Saucedemo")
    public void queElUsuarioIngresoASaucedemo() {
        theActorCalled("EQUIPO CALIDAD")
                .wasAbleTo(Open.url(SHOPING_CART_URL));
    }

    @Dado("que procede a autenticarse con usuario y contrasena")
    public void queProcedeAAutenticarseConUsuarioYContrasena() {
        theActorInTheSpotlight().attemptsTo(Autenticar.enLaAplicacion());
    }

    @Cuando("procede a agregar los productos")
    public void procedeAAgregarLosProductos() {
        theActorInTheSpotlight().attemptsTo(
                RealizarCompra.productos("cualquiera"),
                RealizarCompra.productos("Sauce Labs Bike Light"),
                RealizarCompra.productos("cualquiera")
        );
    }

    @E("ingresa al carrito y elimina el primer producto agregado")
    public void ingresaAlCarritoYEliminaElPrimerProductoAgregado() {
        theActorInTheSpotlight().attemptsTo(IngresarCarrito.eliminarProducto());
    }

    @Y("Realizar checkout")
    public void realizarCheckout() {
        theActorInTheSpotlight().attemptsTo(RealizarCheckout.compra());
    }

    @Entonces("el sistema debera mostrar el mensaje de exito")
    public void elSistemaDeberaMostrarElMensajeDeExito() {
        theActorInTheSpotlight().should(seeThat(
                ValidarMensaje.deElementos(LBL_MENSAJE.resolveFor(theActorInTheSpotlight()).getText(),
                        "Thank you for your order!")));
    }

    @Y("Luego cierra la sesion")
    public void luegoCierraLaSesion() {
        theActorInTheSpotlight().attemptsTo(CerrarSesion.app());
    }


}
