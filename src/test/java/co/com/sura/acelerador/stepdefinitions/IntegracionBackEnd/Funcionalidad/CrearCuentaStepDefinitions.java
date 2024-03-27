package co.com.sura.acelerador.stepdefinitions.IntegracionBackEnd.Funcionalidad;

import co.com.sura.acelerador.exceptions.EstadoCodigoExcepcion;
import co.com.sura.acelerador.questions.EstadoCodigo;
import co.com.sura.acelerador.tasks.Generar;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Entonces;
import net.serenitybdd.rest.SerenityRest;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import org.hamcrest.Matchers;
import org.junit.Before;
import net.serenitybdd.screenplay.rest.abilities.CallAnApi;

import static co.com.sura.acelerador.exceptions.EstadoCodigoExcepcion.MSJ_EXCEP_STAT_CODE;
import static co.com.sura.acelerador.util.Constantes.*;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class CrearCuentaStepDefinitions {

    @Before
    public void setup(){
        OnStage.setTheStage(OnlineCast.whereEveryoneCan(
                CallAnApi.at(BASE_URL_API)));
        SerenityRest.useRelaxedHTTPSValidation();
    }

    @Cuando("intento crear una cuenta {string} obteniendo fondos de la cuenta {string} para un cliente no existente con ID {string}")
    public void iTryToCreateAnAccountTypeByGettingFundsFromAccountForANonExistingClientWithId(String accountType, String accountNumber, String clientId){
        theActorCalled(FRONTEND).attemptsTo(
                Generar.createAccount().withAccount(accountNumber).ofType(accountType).and(clientId)
        );
    }

    @Entonces("el sistema no debería permitir crear la cuenta")
    public void theSystemShouldNotAllowToCreateTheAccount(){
        theActorInTheSpotlight().should(seeThat(
                EstadoCodigo.is(STATUS_CODE_INTERNAL_SUCCESS), Matchers.equalTo(true)).orComplainWith(EstadoCodigoExcepcion.class, MSJ_EXCEP_STAT_CODE)
        );
    }
}
