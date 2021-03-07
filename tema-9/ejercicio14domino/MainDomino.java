/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio14domino;

/**
 *
 * @author Ander De Abrisqueta Rangel
 */
public class MainDomino {

  /**
   * @param args the command line arguments
   */
  public static void main(String args[]) {
    FichaDomino f1 = new FichaDomino(6, 1);
    FichaDomino f2 = new FichaDomino(0, 4);
    FichaDomino f3 = new FichaDomino(3, 3);
    FichaDomino f4 = new FichaDomino(0, 1);
    System.out.println(f1);
    System.out.println(f2);
    System.out.println(f3);
    System.out.println(f4);
    System.out.println(f2.voltea());
    System.out.println(f2.encaja(f4));
    System.out.println(f1.encaja(f4));
    System.out.println(f1.encaja(f3));
    System.out.println(f1.encaja(f2));
  }
}
