package co.com.sura.acelerador.runners.Sistema.Funcionalidad;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features = "src/test/resources/features/Sistema/Funcionalidad/InicioSesion.feature",
        glue = "co.com.sura.acelerador.stepdefinitions.Sistema",
        snippets = CucumberOptions.SnippetType.CAMELCASE)
public class InicioSesionRunner {
}
