package tema7;

import java.util.Scanner;

/**
 *
 * @author Ander De Abrisqueta Rangel
 */
public class Ejercicio16Multiplo5O7 {

  /**
   * @param args the command line arguments
   */
  public static void main(String args[]) {
    int[] numerosEnterosAleatorios = new int[20];
    int i;

    for (i = 0; i < 20; i++) {
      numerosEnterosAleatorios[i] = (int) (Math.random() * 401);
      System.out.print(numerosEnterosAleatorios[i] + " ");
    }
    System.out.println("");
    System.out.print("¿Qué números quiere resaltar? "
            + "(1 – los múltiplos de 5, 2 – los múltiplos de 7): ");

    Scanner s = new Scanner(System.in);
    int seleccion = Integer.parseInt(s.nextLine());

    System.out.println("");

    if (seleccion == 1) {
      for (int n : numerosEnterosAleatorios) {
        if (n % 5 == 0) {
          System.out.print("[" + n + "] ");
        } else {
          System.out.print(n + " ");
        }
      }
    }

    if (seleccion == 2) {
      for (int n : numerosEnterosAleatorios) {
        if (n % 7 == 0) {
          System.out.print("[" + n + "] ");
        } else {
          System.out.print(n + " ");
        }

      }
    }

  }

}
