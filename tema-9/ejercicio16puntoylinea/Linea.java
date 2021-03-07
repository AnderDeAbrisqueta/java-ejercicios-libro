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
public class Linea {
  private Punto p1;
  private Punto p2;

  public Linea(Punto p1, Punto p2) {
    this.p1 = p1;
    this.p2 = p2;
  }

  @Override
  public String toString() {
    return "Línea formada por los puntos " + p1 + " y " + p2 ;
  }

  
  
  
  
  
}
