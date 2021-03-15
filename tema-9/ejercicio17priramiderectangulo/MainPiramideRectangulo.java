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
public class MainPiramideRectangulo {

  /**
   * @param args the command line arguments
   */
  public static void main(String args[]) {
    Piramide p = new Piramide(4);
    Rectangulo r1 = new Rectangulo(4, 3);
    Rectangulo r2 = new Rectangulo(6, 2);
    System.out.println(p);
    System.out.println(r1);
    System.out.println(r2);
    System.out.println("Pirámides creadas: " + Piramide.getPiramidesCreadas());
    System.out.println("Rectángulos creados: " + Rectangulo.getRectangulosCreados());
  }
}
