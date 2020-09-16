package co.com.bancolombia.certification.reto.runners;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@CucumberOptions(
    features = "src/test/resources/features/registrar_usuario.feature",
    glue = "co.com.bancolombia.certification.reto.stepdefinitions")
@RunWith(CucumberWithSerenity.class)
public class RegistrarUsuario {}
