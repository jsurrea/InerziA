package com.example.inerzia.modelo;

public class Profile {

  //Declaracion de variables
  private String motivacion;
  private String correoElectronico;
  private String dedicacion;
  private int numeroDePalabras;

  //Constructor
  public Profile (){

  }

  //Encapsulacion


  public String getMotivacion() {
    return motivacion;
  }

  public void setMotivacion(String motivacion) {
    this.motivacion = motivacion;
  }

  public String getCorreoElectronico() {
    return correoElectronico;
  }

  public void setCorreoElectronico(String correoElectronico) {
    this.correoElectronico = correoElectronico;
  }

  public String getDedicacion() {
    return dedicacion;
  }

  public void setDedicacion(String dedicacion) {
    this.dedicacion = dedicacion;
  }

  public int getNumeroDePalabras() {
    return numeroDePalabras;
  }

  public void setNumeroDePalabras(int numeroDePalabras) {
    this.numeroDePalabras = numeroDePalabras;
  }

  //Metodo toString


  @Override
  public String toString() {
    return "Profile{" +
            "motivacion='" + motivacion + '\'' +
            ", correoElectronico='" + correoElectronico + '\'' +
            ", dedicacion='" + dedicacion + '\'' +
            ", numeroDePalabras=" + numeroDePalabras +
            '}';
  }
}
