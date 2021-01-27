package tema7;

import java.util.Scanner;

/**
 *
 * @author Ander De Abrisqueta Rangel
 */
public class Ejercicio17Rotado2 {

  /**
   * @param args the command line arguments
   */
  public static void main(String args[]) {
    //Construcción del array original
    int[] numeroEnteroAletorio = new int[10];

    for (int i = 0; i < 10; i++) {
      numeroEnteroAletorio[i] = (int) (Math.random() * 101);
    }

    System.out.println("Array Original");

    System.out.println("\n┌────────┬─────┬─────┬─────┬─────┬─────┬─────┬─────┬─────┬─────┬─────┐");
    System.out.print("│ Índice ");
    for (int i = 0; i < 10; i++) {
      System.out.printf("│%5d", i);
    }
    System.out.println("│\n├────────┼─────┼─────┼─────┼─────┼─────┼─────┼─────┼─────┼─────┼─────┤");
    System.out.print("│ Valor  ");
    for (int n : numeroEnteroAletorio) {
      System.out.printf("│%5d", n);
    }
    System.out.println("│\n└────────┴─────┴─────┴─────┴─────┴─────┴─────┴─────┴─────┴─────┴─────┘");

    //Comprobar la introducción de los datos
    Scanner s = new Scanner(System.in);
    boolean esNumeroCorrecto = false;
    int numeroSeleccionado;

    do {
      esNumeroCorrecto = false;

      System.out.print("Por favor, introduzca un valor del array: ");
      numeroSeleccionado = Integer.parseInt(s.nextLine());

      for (int n : numeroEnteroAletorio) {

        if (numeroSeleccionado == n) {
          esNumeroCorrecto = true;
        }
      }

      if (!esNumeroCorrecto) {
        System.out.println("Ese número no está en el array.");
      }

    } while (!esNumeroCorrecto);

    //Rotación del número seleccionado hasta la posición 0 del array
    int indiceNumeroSeleccionado = 0;
    for (int i = 0; i < 10; i++) {
      if (numeroSeleccionado == numeroEnteroAletorio[i]) {
        indiceNumeroSeleccionado = i;
      }
    }

    int[] numeroRotado = new int[10];

    if (indiceNumeroSeleccionado != 0) {
      for (int i = 0; i < (10 - indiceNumeroSeleccionado); i++) {
        numeroRotado[i] = numeroEnteroAletorio[indiceNumeroSeleccionado + i];
      }
      int indiceAuxiliar = 0;
      for (int i = (10 - indiceNumeroSeleccionado); i < 10; i++) {
        numeroRotado[i] = numeroEnteroAletorio[indiceAuxiliar++];
      }

      System.out.println("Array Original");

      System.out.println("\n┌────────┬─────┬─────┬─────┬─────┬─────┬─────┬─────┬─────┬─────┬─────┐");
      System.out.print("│ Índice ");
      for (int i = 0; i < 10; i++) {
        System.out.printf("│%5d", i);
      }
      System.out.println("│\n├────────┼─────┼─────┼─────┼─────┼─────┼─────┼─────┼─────┼─────┼─────┤");
      System.out.print("│ Valor  ");
      for (int n : numeroRotado) {
        System.out.printf("│%5d", n);
      }
      System.out.println("│\n└────────┴─────┴─────┴─────┴─────┴─────┴─────┴─────┴─────┴─────┴─────┘");

    } else {

      System.out.println("Array Original");

      System.out.println("\n┌────────┬─────┬─────┬─────┬─────┬─────┬─────┬─────┬─────┬─────┬─────┐");
      System.out.print("│ Índice ");
      for (int i = 0; i < 10; i++) {
        System.out.printf("│%5d", i);
      }
      System.out.println("│\n├────────┼─────┼─────┼─────┼─────┼─────┼─────┼─────┼─────┼─────┼─────┤");
      System.out.print("│ Valor  ");
      for (int n : numeroEnteroAletorio) {
        System.out.printf("│%5d", n);
      }
      System.out.println("│\n└────────┴─────┴─────┴─────┴─────┴─────┴─────┴─────┴─────┴─────┴─────┘");

    }

  }
}
