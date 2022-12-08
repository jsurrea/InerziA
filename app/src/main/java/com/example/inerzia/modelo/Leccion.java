package com.example.inerzia.modelo;

public class Leccion {

  //Declaracion de variables

  private String keyword;
  private String audio;
  private String imagen;
  private String phrase;

  //Constructor
  public Leccion (){

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

  public String getPhrase() {
    return phrase;
  }

  public void setPhrase(String phrase) {
    this.phrase = phrase;
  }

  //Metodo toString

  @Override
  public String toString() {
    return "Leccion{" +
            "keyword='" + keyword + '\'' +
            ", audio='" + audio + '\'' +
            ", imagen='" + imagen + '\'' +
            ", phrase='" + phrase + '\'' +
            '}';
  }
}