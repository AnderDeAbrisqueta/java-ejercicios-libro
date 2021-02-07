/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema8;

import java.util.Scanner;

/**
 *
 * @author Ander De Abrisqueta Rangel
 */
public class Ejercicio42PintaTrianguloHueco {

  /**
   * @param args the command line arguments
   */
  public static void main(String args[]) {
    Scanner s = new Scanner(System.in);
    System.out.print("Introduzca la altura de la figura: ");
    int altura = Integer.parseInt(s.nextLine());
    
    System.out.println(misfunciones.ArrayUnidimensional.pintaLineas('*', altura));
    
    for (int i = altura - 2; i > 0; i--) {
      System.out.print("*");
      System.out.print(misfunciones.ArrayUnidimensional.pintaLineas(' ', i - 1)); 
      System.out.print("*\n");
    }
    
    System.out.println("*");
    
  }
}
