/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio10ameba;

/**
 *
 * @author Ander De Abrisqueta Rangel
 */
public class MainAmeba {

  /**
   * @param args the command line arguments
   */
  public static void main(String args[]) {
    Ameba a1 = new Ameba();
    a1.come(2);
    System.out.println(a1);
    Ameba a2 = new Ameba();
    a2.come(4);
    System.out.println(a2);
    a1.come(a2);
    System.out.println(a1);
    System.out.println(a2);
    a2.come(3);
    System.out.println(a2);
  }
}
