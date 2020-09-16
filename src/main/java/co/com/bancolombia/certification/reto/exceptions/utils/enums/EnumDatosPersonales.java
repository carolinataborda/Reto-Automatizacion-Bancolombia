package co.com.bancolombia.certification.reto.utils.enums;

public enum EnumDatosPersonales {
  PRIMER_NOMBRE("Carolina"),
  APELLIDO("Taborda"),
  EMAIL("caro@gmail.com"),
  MES_NACIMIENTO("February"),
  DIA_NACIMIENTO("23"),
  AÑO_NACIMIENTO("1993");

  private final String datosPersonales;

  EnumDatosPersonales(String datosPersonales) {
    this.datosPersonales = datosPersonales;
  }

  public String getDatosPersonales() {
    return datosPersonales;
  }
}
