/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio17priramiderectangulo;

/**
 *
 * @author Ander De Abrisqueta Rangel
 */
public class Rectangulo {
  private int base;
  private int altura;
  private static int rectangulosCreados;

  public Rectangulo(int base, int altura) {
    this.base = base;
    this.altura = altura;
    rectangulosCreados++;
  }

  public static int getRectangulosCreados() {
    return rectangulosCreados;
  }

  @Override
  public String toString() {
    String cadena = "";
    
    for (int i = 0; i < altura; i++) {
      for (int j = 0; j < base; j++) {
        cadena += '*';
      }
      cadena += '\n';
    }
    return cadena;
  }
  
}
