package co.com.bancolombia.certification.reto.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public final class IngresarDatosPersonalesPage {

  public static final Target BTN_JOIN =
      Target.the("Boton unirse")
          .located(By.xpath("//a[@class='unauthenticated-nav-bar__sign-up']"));
  public static final Target TXT_FIRST_NAME =
      Target.the("Ingresar primer nombre").located(By.xpath("//input[@id='firstName']"));
  public static final Target TXT_LAST_NAME =
      Target.the("Ingresar apellido").located(By.xpath("//input[@id='lastName']"));
  public static final Target TXT_EMAIL =
      Target.the("Ingresar correo electronico").located(By.xpath("//input[@id='email']"));
  public static final Target TXT_MONTH_OF_BIRTH =
      Target.the("Ingresar mes de nacimiento")
          .locatedBy(("//*[@id='birthMonth']/option[@label='{0}']"));
  public static final Target TXT_DAY_OF_BIRTH =
      Target.the("Ingresar dia de nacimiento")
          .locatedBy(("//*[@id=\"birthDay\"]/option[@label='{0}']"));
  public static final Target TXT_YEAR_OF_BIRTH =
      Target.the("Ingresar año de nacimiento")
          .locatedBy(("//select[@id='birthYear']/option[@label='{0}']"));
  public static final Target BTN_NEXT_PAGE =
      Target.the("Siguiente Pagina").located(By.xpath("//span[contains(text(),'Next: Location')]"));
}
