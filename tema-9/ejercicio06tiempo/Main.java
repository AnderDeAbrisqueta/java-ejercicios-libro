/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio06tiempo;

/**
 *
 * @author Ander De Abrisqueta Rangel
 */
public class Main {

  /**
   * @param args the command line arguments
   */
  public static void main(String args[]) {
    Tiempo t = new Tiempo(0, 30, 40);
    
    System.out.println(t);
    System.out.println(t.suma(0, 35, 20));
  }
}
