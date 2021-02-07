/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema8;

import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class Ejercicio45Valle {

  /**
   * @param args the command line arguments
   */
  public static void main(String args[]) {
    Scanner s = new Scanner(System.in);
    System.out.print("Introduzca la altura de la figura: ");
    int altura = Integer.parseInt(s.nextLine());

    for (int i = 1; i < altura; i++) {
      System.out.print(misfunciones.ArrayUnidimensional.pintaLineas('*', i));
      System.out.print(misfunciones.ArrayUnidimensional.pintaLineas(' ', altura * 2 - i * 2 - 1));
      System.out.println(misfunciones.ArrayUnidimensional.pintaLineas('*', i));
    }
    System.out.println(misfunciones.ArrayUnidimensional.pintaLineas('*', altura * 2 - 1));
  }
}
