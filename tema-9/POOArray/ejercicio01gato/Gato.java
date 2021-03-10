/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio01gato;

/**
 *
 * @author Ander De Abrisqueta Rangel
 */
public class Gato {

  private String nombre;
  private String raza;
  private String color;

  public Gato() {
  }

  public Gato(String nombre, String raza, String color) {
    this.nombre = nombre;
    this.raza = raza;
    this.color = color;
  }

  public String getNombre() {
    return nombre;
  }

  public String getRaza() {
    return raza;
  }

  public String getColor() {
    return color;
  }

  public void setNombre(String nombre) {
    this.nombre = nombre;
  }

  public void setRaza(String raza) {
    this.raza = raza;
  }

  public void setColor(String color) {
    this.color = color;
  }

  @Override
  public String toString() {
    return "Nombre: " + nombre + ", raza: " + raza + ", color: " + color;
  }

}
