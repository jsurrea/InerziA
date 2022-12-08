package com.example.inerzia.modelo;

public class SignUp {

  //Declaracion de variables
  private String contraseña;
  private String correoElectronico;
  private String nombreNickname;

  //Constructor
  public SignUp () {

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

  public String getNombreNickname() {
    return nombreNickname;
  }

  public void setNombreNickname(String nombreNickname) {
    this.nombreNickname = nombreNickname;
  }

  //Metodo toString


  @Override
  public String toString() {
    return "SignUp{" +
            "contraseña='" + contraseña + '\'' +
            ", correoElectronico='" + correoElectronico + '\'' +
            ", nombreNickname='" + nombreNickname + '\'' +
            '}';
  }
}