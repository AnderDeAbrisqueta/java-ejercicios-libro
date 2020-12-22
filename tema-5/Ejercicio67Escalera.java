/*
 *Realiza un programa que pinte una escalera que va descendiendo de izquierda
 *a derecha. El programa pedirá el número de escalones y la altura de cada
 *escalón. La anchura de los escalones siempre es la misma: 4 asteriscos.
 */
package tema5;

import java.util.Scanner;

/**
 *
 * @AnderDeAbrisquetaRangel
 */
public class Ejercicio67Escalera {

  /**
   * @param args the command line arguments
   */
  public static void main(String args[]) {
    System.out.println("Programa que pinta una Escalera\n"); 
    
    Scanner s = new Scanner(System.in);
    
    System.out.print("Por favor, introduza los números de escalones: ");
    int numeroEscalones = Integer.parseInt(s.nextLine());
    System.out.println("");
    
    System.out.print("Por favor, introduza la altura de cada escalón: ");
    int alturaEscalon = Integer.parseInt(s.nextLine());
    System.out.println("");

      for (int i = 1; i <= numeroEscalones; i++) {
        for (int j = 1; j <= alturaEscalon; j++) {
          for (int k = 0; k < i; k++) {
            System.out.print("*****");
          }
          System.out.println("");
        }
        
        
      }
  }
}
