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
public class Ejercicio44PintaTrianguloInvertidoHueco {

  /**
   * @param args the command line arguments
   */
  public static void main(String args[]) {
    Scanner s = new Scanner(System.in);
    System.out.print("Introduzca la altura de la figura: ");
    int altura = Integer.parseInt(s.nextLine());

    System.out.println(misfunciones.ArrayUnidimensional.pintaLineas('*', altura));
    
    for (int i = 1; i < altura; i++) {
      for (int j = 0; j < i; j++) {
        System.out.print(" ");
      }
      System.out.print("*");
      System.out.print(misfunciones.ArrayUnidimensional.pintaLineas(' ', altura - i - 2));
      
      if (i < altura - 1) {
        System.out.print("*\n");
      }
    }
    System.out.println("");
  }
}
