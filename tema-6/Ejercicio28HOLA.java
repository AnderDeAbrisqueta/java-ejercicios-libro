package tema6;

import java.util.Scanner;

/**
 *
 * @author Ander De Abrisqueta Rangel
 */
public class Ejercicio28HOLA {

  /**
   * @param args the command line arguments
   */
  public static void main(String args[]) {
    Scanner s = new Scanner(System.in);

    int altura = 0;
    boolean esImpar = false;

    do {
      altura = (int) (Math.random() * ((13 - 3) + 1) + 3);

      if (altura % 2 != 0) {
        esImpar = true;

      }

    } while (!esImpar);

    System.out.println("*    *   ****   *        **** ");

    for (int i = 0; i < (altura - 3) / 2; i++) {
      System.out.println("*    *  *    *  *       *    *");

    }

    System.out.println("******  *    *  *       ******");

    for (int i = 0; i < (altura - 3) / 2; i++) {
      System.out.println("*    *  *    *  *       *    *");

    }

    System.out.println("*    *   ****   ******  *    *");
  }
}
