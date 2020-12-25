package tema5;

import java.util.Scanner;

/**
 *
 * @author Ander De Abrisqueta Rangel
 */
public class Ejercicio61V {

  /**
   * @param args the command line arguments
   */
  public static void main(String args[]) {
    Scanner s = new Scanner(System.in);

    boolean esAlturaCorrecta = false;
    int altura = 0;

    do {
      System.out.print("Por favor, introduzca la altura de la V");
      System.out.print("(un número mayor o igual a 3): ");
      altura = Integer.parseInt(s.nextLine());

      if (altura >= 3) {
        esAlturaCorrecta = true;
      } else {
        System.out.println("La altura debe ser mayor o igual a 3");
      }

    } while (!esAlturaCorrecta);

    for (int i = 0; i < altura; i++) {
      for (int j = 0; j < i; j++) {
        System.out.print(" ");
      }
      System.out.print("***");
      
      for (int j = 0; j < (altura - i - 1) * 2; j++) {
          System.out.print(" ");
      }
      System.out.print("***");
      System.out.println("");
    }
    for (int i = 0; i < altura; i++) {
      System.out.print(" ");
    }

  }
}
