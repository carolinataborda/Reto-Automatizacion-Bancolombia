package co.com.bancolombia.certification.reto.stepdefinitions;

import static co.com.bancolombia.certification.reto.utils.enums.EnumDatosPersonales.*;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

import co.com.bancolombia.certification.reto.tasks.IngresarDatosPersonales;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Entonces;

public class RegistrarUsuarioStepDefinition {

  @Cuando("un {string} ingresa los datos personales")
  public void ingresaLosDatosPersonales(String usuario) {
    theActorInTheSpotlight().attemptsTo(IngresarDatosPersonales.paraElRegistro());
  }

  @Entonces("todavia no se")
  public void todaviaNoSe() {}
}
