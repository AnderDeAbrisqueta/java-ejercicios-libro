/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio04fraccion;

/**
 *
 * @author Ander De Abrisqueta Rangel
 */
public class Main {

  /**
   * @param args the command line arguments
   */
  public static void main(String args[]) {
    Fraccion f1 = new Fraccion (-2,3);
    Fraccion f2 = new Fraccion (-4, 5);
    Fraccion f3 = new Fraccion (-20,100);
    
    System.out.println(f1);
    System.out.println(f2);
    System.out.println(f1.invierte());
    System.out.println(f2.invierte());
    System.out.println(f1.multiplica(f2));
    System.out.println(f2.multiplica(f1));
    System.out.println(f1.multiplica(-4));
    System.out.println(f1.multiplica(5));
    System.out.println(f2.multiplica(-4));
    System.out.println(f2.multiplica(5));
    System.out.println(f1.divide(f2));
    System.out.println(f2.divide(f1));
    System.out.println(f1.divide(4));
    System.out.println(f2.divide(4));
    System.out.println(f1.divide(-4));
    System.out.println(f2.divide(-4));
    System.out.println(f3.simplifica());
  }
}
