/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio02gatoampliacion;

/**
 *
 * @author Ander De Abrisqueta Rangel
 */
public class Gato {

  private String nombre;
  private String color;
  private String sexo;

  public Gato() {
  }

  public Gato(String nombre, String color, String sexo) {
    this.nombre = nombre;
    this.color = color;
    this.sexo = sexo;
  }

  public String getNombre() {
    return nombre;
  }

  public String getColor() {
    return color;
  }

  public String getSexo() {
    return sexo;
  }

  public void setNombre(String nombre) {
    this.nombre = nombre;
  }

  public void setColor(String color) {
    this.color = color;
  }

  public void setSexo(String sexo) {
    this.sexo = sexo;
  }

  @Override
  public String toString() {
    return "Nombre: " + nombre + ", color: " + color + " y sexo: " + sexo;
  }
  
  
  
  

 

}
