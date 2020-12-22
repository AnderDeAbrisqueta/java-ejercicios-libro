package tema5;

import java.util.Scanner;

/**
 *Escribe un programa que calcule el factorial de un número entero leído por
 *teclado.
 * 
 * @author Ander De Abrisqueta Rangel
 */
public class Ejercicio28Factorial {

  /**
   * @param args the command line arguments
   */
  public static void main(String args[]) {
    System.out.println("Programa que calcula el factorial de un número\n");

    Scanner s = new Scanner(System.in);
    
    System.out.print("Por favor, introduza un número entero: ");
    int numeroIntroducido = Integer.parseInt(s.nextLine());
    System.out.println("");
    
    int total= 1;
    
    for (int i = 1; i <= numeroIntroducido; i++) {
      total *= i;
      
    }
      System.out.println(numeroIntroducido + "! = " + total);
  }
}
