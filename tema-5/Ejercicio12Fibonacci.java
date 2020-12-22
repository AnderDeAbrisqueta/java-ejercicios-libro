/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema5;

import java.util.Scanner;

/**
 *
 * @AnderDeAbrisqueta
 */
public class Ejercicio12Fibonacci {

  /**
   * @param args the command line arguments
   */
  public static void main(String args[]) {
  
    
    Scanner s = new Scanner(System.in);
    
    System.out.println("Programa que calcula los primeros n números "); 
    System.out.println("la serie de Fibonacci\n");
    
    System.out.print("Por favor, introduzca la cantidad de números de Fibonacci: ");
    int numero = Integer.parseInt(s.nextLine());
    System.out.print("");
    
    int n= 1;
    int anterior = 0;
    int nTemporal;
    
    System.out.printf("0");
    
    for (int i = 0; i < numero; i++) {
      System.out.printf("%6d\n", n);
      nTemporal = n;
      n = n + anterior;
      anterior = nTemporal;
    }
  }
}
