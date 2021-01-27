package tema7;

import java.util.Scanner;

/**
 *
 * @author Ander De Abrisqueta Rangel
 */
public class Ejercicio11ArrayPrimo {

  /**
   * @param args the command line arguments
   */
  public static void main(String args[]) {
    Scanner s = new Scanner(System.in);

    System.out.println("Por favor, introduzca 10 números enteros.");

    //Array original y determinación de los primos
    int[] INDICE = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
    int[] numero = new int[10];
    int i, j;
    boolean esPrimo = false;
    int[] numeroPrimo = new int[10];
    int[] numeroNoPrimo = new int[10];
    int contadorPrimo = 0;
    int contadorNoPrimo = 0;

    for (i = 0; i < 10; i++) {
      System.out.print("número " + "[" + i + "]: ");
      numero[i] = Integer.parseInt(s.nextLine());

      esPrimo = true;
      for (j = 2; j < numero[i] - 1; j++) {
        if (numero[i] % j == 0) {
          esPrimo = false;
        }
      }

      if (esPrimo) {
        numeroPrimo[contadorPrimo++] = numero[i];
      } else {
        numeroNoPrimo[contadorNoPrimo++] = numero[i];
      }
    }
    System.out.println("Array Original");
    System.out.println("\n┌────────┬─────┬─────┬─────┬─────┬─────┬─────┬─────┬─────┬─────┬─────┐");
    System.out.print("│ Índice ");
    for (i = 0; i < 10; i++) {
      System.out.printf("│%5d", INDICE[i]);
    }
    System.out.println("│\n├────────┼─────┼─────┼─────┼─────┼─────┼─────┼─────┼─────┼─────┼─────┤");
    System.out.print("│ Valor  ");
    for (i = 0; i < 10; i++) {
      System.out.printf("│%5d", numero[i]);
    }
    System.out.println("│\n└────────┴─────┴─────┴─────┴─────┴─────┴─────┴─────┴─────┴─────┴─────┘");

    //Clasificación de los primos
    for (i = 0; i < contadorPrimo; i++) {
      numero[i] = numeroPrimo[i];
    }

    for (i = contadorPrimo; i < contadorPrimo + contadorNoPrimo; i++) {
      numero[i] = numeroNoPrimo[i - contadorPrimo];
    }
    System.out.println("");
    System.out.println("Array Final");
    System.out.println("\n┌────────┬─────┬─────┬─────┬─────┬─────┬─────┬─────┬─────┬─────┬─────┐");
    System.out.print("│ Índice ");
    for (i = 0; i < 10; i++) {
      System.out.printf("│%5d", INDICE[i]);
    }
    System.out.println("│\n├────────┼─────┼─────┼─────┼─────┼─────┼─────┼─────┼─────┼─────┼─────┤");
    System.out.print("│ Valor  ");
    for (i = 0; i < 10; i++) {
      System.out.printf("│%5d", numero[i]);
    }
    System.out.println("│\n└────────┴─────┴─────┴─────┴─────┴─────┴─────┴─────┴─────┴─────┴─────┘");
  }
}
