/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio16puntoylinea;

/**
 *
 * @author Ander De Abrisqueta Rangel
 */
public class Punto {

  private double coordenadaX;
  private double coordenadaY;

  public Punto() {
  }

  public Punto(double coordenadaX, double coordenadaY) {
    this.coordenadaX = coordenadaX;
    this.coordenadaY = coordenadaY;
  }

  @Override
  public String toString() {
    return "(" + coordenadaX + ", " + coordenadaY + ")";
  }

}
