/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema5;

import java.util.Scanner;

/**
 *Escribe un programa que pida un número entero positivo por teclado y que
 *muestre a continuación los números desde el 1 al número introducido junto
 *con su factorial.
 * @author Ander De Abrisqueta Rangel
 */
public class Ejercicio39Factorial2 {

  /**
   * @param args the command line arguments
   */
  public static void main(String args[]) {
    System.out.println("Programa que calcula el factorial de un número\n");

    Scanner s = new Scanner(System.in);
    
    System.out.print("Por favor, introduza un número entero positivo: ");
    int numeroIntroducido = Integer.parseInt(s.nextLine());
    System.out.println("");
    
    int total= 1;
    
    for (int i = 1; i <= numeroIntroducido; i++) {
      total *= i;
      System.out.println(i + "! = " + total);
      
    }
  }
}
