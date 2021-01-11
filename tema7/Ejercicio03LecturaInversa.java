package tema7;

import java.util.Scanner;

/**
 * Escribe un programa que lea 10 números por teclado y que luego los muestre en
 * orden inverso, es decir, el primero que se introduce es el último en
 * mostrarse y viceversa.
 *
 * @author Ander De Abrisqueta Rangel
 */
public class Ejercicio03LecturaInversa {

  /**
   * @param args the command line arguments
   */
  public static void main(String args[]) {
    Scanner s = new Scanner(System.in);

    int[] numero = new int[10];

    System.out.println("Por favor, introduce 10 números");

    for (int i = 0; i < 10; i++) {

      System.out.print("número " + "[" + i + "]: ");
      numero[i] = Integer.parseInt(s.nextLine());
    }

    System.out.print("El orden inverso es: ");

    for (int i = 0; i < 10; i++) {
      System.out.print(numero[9 - i] + " ");
    }
  }
}
