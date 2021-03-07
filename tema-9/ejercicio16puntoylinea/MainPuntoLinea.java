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
public class MainPuntoLinea {

  /**
   * @param args the command line arguments
   */
  public static void main(String args[]) {
    Punto p1 = new Punto(4.21, 7.3);
    Punto p2 = new Punto(-2, 1.66);
    Linea l = new Linea(p1, p2);
    System.out.println(l);
  }
}
