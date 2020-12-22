/*
 *Escribe un programa que diga si un número introducido por teclado es o no
 *primo. Un número primo es aquel que sólo es divisible entre él mismo y la
 *unidad.
 */
package tema5;

import java.util.Scanner;

/**
 *
 * @AnderDeAbrisquetaRangel
 */
public class Ejercicio16NumeroPrimo {

  /**
   * @param args the command line arguments
   */
  public static void main(String args[]) {
    System.out.println("Programa que calcula si un número es primo\n"); 
    
    Scanner s = new Scanner(System.in);
    
    System.out.print("Por favor, introduza el número: ");
    int numero = Integer.parseInt(s.nextLine());
    System.out.println("");
    
    boolean numeroPrimo = true;
    
    for (int i = 2; i < numero; i++) {
      double evaluacionNumero = numero%i;
      
      if (evaluacionNumero == 0) {
          numeroPrimo = false;
      }  
    }      
    System.out.println("-----------------------");
    if (numeroPrimo) {
     System.out.println("Este número es primo");
          
    } else {
       System.out.println("Este número no es primo");
          
    } 
  }
    
}
