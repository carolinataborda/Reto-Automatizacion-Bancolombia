package co.com.bancolombia.certification.reto.tasks;

import static co.com.bancolombia.certification.reto.userinterfaces.IngresarDatosPersonalesPage.*;
import static co.com.bancolombia.certification.reto.utils.enums.EnumDatosPersonales.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class IngresarDatosPersonales implements Task {

  @Override
  public <T extends Actor> void performAs(T actor) {

    actor.attemptsTo(
        Click.on(BTN_JOIN),
        Enter.theValue(PRIMER_NOMBRE.getDatosPersonales()).into(TXT_FIRST_NAME),
        Enter.theValue(APELLIDO.getDatosPersonales()).into(TXT_LAST_NAME),
        Enter.theValue(EMAIL.getDatosPersonales()).into(TXT_EMAIL),
        Click.on(TXT_MONTH_OF_BIRTH.of(MES_NACIMIENTO.getDatosPersonales())),
        Click.on(TXT_DAY_OF_BIRTH.of(DIA_NACIMIENTO.getDatosPersonales())),
        Click.on(TXT_YEAR_OF_BIRTH.of(AÑO_NACIMIENTO.getDatosPersonales())),
        Click.on(BTN_NEXT_PAGE));
  }

  public static IngresarDatosPersonales paraElRegistro() {
    return instrumented(IngresarDatosPersonales.class);
  }
}
