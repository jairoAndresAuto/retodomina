package co.com.sura.acelerador.runners.IntegracionBackEnd.Funcionalidad;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features = "src/test/resources/features/IntegracionBackEnd/Funcionalidad/CrearCuenta.feature",
                glue = "co.com.sura.acelerador.stepdefinitions",
                snippets = CucumberOptions.SnippetType.CAMELCASE)
public class CrearCuentaRunner {
}
