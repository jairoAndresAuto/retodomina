package co.com.saucedo.automatizacion.runners;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features = "src/test/resources/features/realizar_compra.feature",
        glue = "co.com.saucedo.automatizacion.stepdefinitions",
        snippets = CucumberOptions.SnippetType.CAMELCASE)
public class CompraRunner {
}
