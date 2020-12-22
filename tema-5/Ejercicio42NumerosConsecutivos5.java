package tema5;

import java.util.Scanner;

/**
 *Escribe un programa que pida un número entero positivo por teclado y que
 *muestre a continuación los 5 números consecutivos a partir del número
 *introducido. Al lado de cada número se debe indicar si se trata de un primo
 *o no.
 * 
 * @author Ander De Abrisqueta Rangel
 */
public class Ejercicio42NumerosConsecutivos5 {

  /**
   * @param args the command line arguments
   */
  public static void main(String args[]) {
    Scanner s = new Scanner(System.in);
    
    System.out.print("Por favor, introduza un número entero positivo: ");
    int numeroEnteroPositivo = Integer.parseInt(s.nextLine());
    System.out.println("");
    
    int numero;
    int i = 0;
    int evaluacionNumeroPrimo;
    boolean numeroPrimo = true;
    
    if (numeroEnteroPositivo >= 0) {
      
      for (i = numeroEnteroPositivo; i < numeroEnteroPositivo + 5; i++) {
        numero = i;
        System.out.print(numero);
        numeroPrimo = true;
        
          for (int j = 2; j < numero; j++) {
            
            evaluacionNumeroPrimo = numero % j;
            
            if (evaluacionNumeroPrimo == 0) {
              numeroPrimo = false;
            }
        
          }
          
          if (numeroPrimo) {
            System.out.println(" es primo.");
          
          } else {
              System.out.println(" no es primo.");
          }
      }
      
    } else {
      System.out.println("El número entero es negativo");
      
    }
  }
}
