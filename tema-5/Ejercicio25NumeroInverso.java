package tema5;

import java.util.Scanner;

/**
 *Realiza un programa que pida un número por teclado y que luego muestre ese
 *número al revés.
 * 
 * @author Ander De Abrisqueta Rangel
 */
public class Ejercicio25NumeroInverso {

  /**
   * @param args the command line arguments
   */
  public static void main(String args[]) {
    System.out.println("Programa que da el número inverso\n"); 
    
    Scanner s = new Scanner(System.in);
    
    System.out.print("Por favor, introduza un número: ");
    int numeroIntroducido = Integer.parseInt(s.nextLine());
    System.out.println("");
    
    int numero = numeroIntroducido;
    int resto = 1;
    int exponente = 1;
    
    while (numero > 0) {   
      resto = numero % 10;
      System.out.print(resto);
      numero = (int) ((double) numero / Math.pow(10, exponente));
      
    }
      System.out.println(" es el inverso del número " + numeroIntroducido);
  }
}
