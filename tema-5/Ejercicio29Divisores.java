package tema5;

import java.util.Scanner;

/**
 * Escribe un programa que muestre por pantalla todos los números enteros
 * positivos menores a uno leído por teclado que no sean divisibles entre otro
 * también leído de igual forma.
 *
 * @author Ander De Abrisqueta Rangel
 */
public class Ejercicio29Divisores {

  /**
   * @param args the command line arguments
   */
  public static void main(String args[]) {
    Scanner s = new Scanner(System.in);

    System.out.print("Por favor, introduza un número entero (relativamente mayor): ");
    int numeroMayor = Integer.parseInt(s.nextLine());
    System.out.println("");

    System.out.print("Por favor, introduza un número entero (relativamente menor): ");
    int numeroMenor = Integer.parseInt(s.nextLine());
    System.out.println("");

    for (int i = 1; i < numeroMayor; i++) {
      if ((i % numeroMenor) != 0) {
        System.out.print(i + " ");

      }

    }

  }
}
