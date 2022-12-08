package com.example.inerzia.modelo;

public class SignIn {

  //Declaracion de variables
  private String contraseña;
  private String correoElectronico;

  //Constructor
  public SignIn (){

  }

  //Encapsulacion
  public String getContraseña() {
    return contraseña;
  }

  public void setContraseña(String contraseña) {
    this.contraseña = contraseña;
  }

  public String getCorreoElectronico() {
    return correoElectronico;
  }

  public void setCorreoElectronico(String correoElectronico) {
    this.correoElectronico = correoElectronico;
  }

  //Metodo toString


  @Override
  public String toString() {
    return "SignIn{" +
            "contraseña='" + contraseña + '\'' +
            ", correoElectronico='" + correoElectronico + '\'' +
            '}';
  }
}
