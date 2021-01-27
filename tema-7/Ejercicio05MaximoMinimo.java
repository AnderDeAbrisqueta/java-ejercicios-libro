package tema7;

import java.util.Scanner;

/**
 *
 * @author Ander De Abrisqueta Rangel
 */
public class Ejercicio05MaximoMinimo {

  /**
   * @param args the command line arguments
   */
  public static void main(String args[]) {
    Scanner s = new Scanner(System.in);

    int[] numero = new int[10];
    int numeroMinimo = Integer.MAX_VALUE;
    int numeroMaximo = Integer.MIN_VALUE;
    int i;

    System.out.println("Por favor, introduce 10 números enteros");

    for (i = 0; i < 10; i++) {
      System.out.print("número " + "[" + i + "]: ");
      numero[i] = Integer.parseInt(s.nextLine());

      if (numero[i] < numeroMinimo) {
        numeroMinimo = numero[i];
      }

      if (numero[i] > numeroMaximo) {
        numeroMaximo = numero[i];
      }

    }
    System.out.println("");
    
    for (i = 0; i < 10; i++) {
      System.out.print(numero[i]);
      
      if (numero[i] == numeroMaximo) {
        System.out.println(" máximo");
      }
      
      if (numero[i] == numeroMinimo) {
        System.out.print(" mínimo");
      }
      System.out.println("");
    }

  }
}
