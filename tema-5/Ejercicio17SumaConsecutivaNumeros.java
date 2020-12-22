/*
 *Realiza un programa que sume los 100 números siguientes a un número entero
 *y positivo introducido por teclado. Se debe comprobar que el dato introducido
 *es correcto (que es un número positivo).
 */
package tema5;

import java.util.Scanner;

/**
 *
 * @AnderDeAbrisquetaRangel
 */
public class Ejercicio17SumaConsecutivaNumeros {

  /**
   * @param args the command line arguments
   */
  public static void main(String args[]) {
    System.out.println("Programa que calcula la suma consecutiva de un número entero\n"); 
    
    Scanner s = new Scanner(System.in);
    
    System.out.print("Por favor, introduza un número entero positivo: ");
    int numeroEnteroPositivo = Integer.parseInt(s.nextLine());
    System.out.println("");
    
    int suma = 0;
    
    if (numeroEnteroPositivo >= 0) {
      
      for (int i = numeroEnteroPositivo; i < numeroEnteroPositivo + 100; i++) {
        suma += i;
        
      }
      
      System.out.printf("La suma total es: %6d\n", suma);
      
    } else {
      System.out.println("El número entero es negativo");
      
    }
  }
}
