package tema7;

import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class Ejercicio06NumerosRotados {

  /**
   * @param args the command line arguments
   */
  public static void main(String args[]) {
    Scanner s = new Scanner(System.in);

    int[] numero = new int[15];

    System.out.println("Por favor, introduce 15 números");

    //Pintar el Array
    int i;

    for (i = 0; i < 15; i++) {
      System.out.print("número [" + i + "]: ");
      numero[i] = Integer.parseInt(s.nextLine());
    }

    System.out.println("");
    //Rotación de los números

    int aux = numero[14];

    for (i = 14; i > 0; i--) {
      numero[i] = numero[i - 1];
    }

    numero[0] = aux;

    System.out.println("***************");
    System.out.println(" Array rotado");
    System.out.println("***************");

    for (i = 0; i < 15; i++) {
      System.out.print("número [" + i + "]: " + numero[i]);
      System.out.println("");
    }
  }
}
