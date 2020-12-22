/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema5;

import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class Ejercicio14Potencia {

  /**
   * @param args the command line arguments
   */
  public static void main(String args[]) {
    System.out.println("Programa que calcula la potencia de un número\n"); 
    
    Scanner s = new Scanner(System.in);
    
    System.out.print("Por favor, introduza la base: ");
    int base = Integer.parseInt(s.nextLine());
    System.out.print("");
    
    System.out.print("Por favor, introduza el exponente: ");
    int exponente = Integer.parseInt(s.nextLine());
    System.out.print("");
      
    double potencia = 1;
        
    if (exponente == 0) {
      potencia = 1;
    }
    
    if (exponente > 0) {
      for (int i = 0; i < exponente; i++) {
        potencia *= base;
      }
    }
    
    if (exponente < 0) {
      for (int i = 0; i < -exponente; i++) {
        potencia *= base;
      }
      
      potencia = 1/potencia;
    }
      System.out.printf("La potencia es: %.2f\n", potencia);
  }
}
