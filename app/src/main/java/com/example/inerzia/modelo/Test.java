package com.example.inerzia.modelo;

public class Test {

  //Declaracion de variables
  private String keyword;
  private String audio;
  private String imagen;
  private String opcion1;
  private String opcion2;
  private String opcion3;
  private String opcion4;

  //Constructor
  public Test (){

  }

  //Encapsulacion

  public String getKeyword() {
    return keyword;
  }

  public void setKeyword(String keyword) {
    this.keyword = keyword;
  }

  public String getAudio() {
    return audio;
  }

  public void setAudio(String audio) {
    this.audio = audio;
  }

  public String getImagen() {
    return imagen;
  }

  public void setImagen(String imagen) {
    this.imagen = imagen;
  }

  public String getOpcion1() {
    return opcion1;
  }

  public void setOpcion1(String opcion1) {
    this.opcion1 = opcion1;
  }

  public String getOpcion2() {
    return opcion2;
  }

  public void setOpcion2(String opcion2) {
    this.opcion2 = opcion2;
  }

  public String getOpcion3() {
    return opcion3;
  }

  public void setOpcion3(String opcion3) {
    this.opcion3 = opcion3;
  }

  public String getOpcion4() {
    return opcion4;
  }

  public void setOpcion4(String opcion4) {
    this.opcion4 = opcion4;
  }

  //Metodo toString

  @Override
  public String toString() {
    return "Test{" +
            "keyword='" + keyword + '\'' +
            ", audio='" + audio + '\'' +
            ", imagen='" + imagen + '\'' +
            ", opcion1='" + opcion1 + '\'' +
            ", opcion2='" + opcion2 + '\'' +
            ", opcion3='" + opcion3 + '\'' +
            ", opcion4='" + opcion4 + '\'' +
            '}';
  }
}
