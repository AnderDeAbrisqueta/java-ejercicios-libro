package tema5;

import java.util.Scanner;

/**
 *
 * @author Ander De Abrisqueta Rangel
 */
public class Ejercicio59ArbolNavidad {

  /**
   * @param args the command line arguments
   */
  public static void main(String args[]) {
    Scanner s = new Scanner(System.in);

    System.out.print("Por favor, introduza la altura (número de líneas): ");
    int altura = Integer.parseInt(s.nextLine());
    System.out.println("");

    int filas = 1;
    int espaciosIniciales = altura - 3;
    int espaciosInternos = 0;
    int i = 0;

    for (i = 1; i <= espaciosIniciales; i++) {
      System.out.print(' ');
    }
    System.out.println("*");

    while (filas < altura - 2) {
      for (i = 1; i <= espaciosIniciales; i++) {
        System.out.print(' ');
      }
      System.out.print("^");

      for (i = 1; i < espaciosInternos; i++) {
        System.out.print(" ");
      }

      if (filas > 1) {
        System.out.print("^");
      }

      System.out.println("");

      filas++;
      espaciosIniciales--;
      espaciosInternos += 2;

    }

    for (i = 1; i < filas * 2; i++) {
      System.out.print("^");
    }

    System.out.println("");

    for (i = 1; i <= altura - 3; i++) {
      System.out.print(' ');
    }
    System.out.println("Y");
  }
}
