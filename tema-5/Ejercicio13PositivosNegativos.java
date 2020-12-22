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
public class Ejercicio13PositivosNegativos {

  /**
   * @param args the command line arguments
   */
  public static void main(String args[]) {
    Scanner s = new Scanner(System.in);
    
    System.out.println("Programa determina cuantos numeros son positivos y negativos\n"); 
    
    int contarNumeroPositivo = 0;
    int contarNumeroNegativo = 0;
    
    for (int i = 1; i < 11; i++) {
      System.out.print("Por favor, introduzca un número (" + i + "): ");
      int numero = Integer.parseInt(s.nextLine());
      System.out.print("");
      
      if (numero >= 0) {
        contarNumeroPositivo++;
        
      } else {
          contarNumeroNegativo++;
      }
    }
      System.out.println("******************************");
      System.out.println("* Hay " + contarNumeroPositivo + " números positivos y *");
      System.out.println("* " + contarNumeroNegativo + " números negativos        *");
      System.out.println("******************************");
  }
}
