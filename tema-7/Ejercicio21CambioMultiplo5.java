/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema7;

/**
 *
 * @author Ander De Abrisqueta Rangel
 */
public class Ejercicio21CambioMultiplo5 {

  /**
   * @param args the command line arguments
   */
  public static void main(String args[]) {
    //Construcción del array original
    int[] numeroEnteroAletorio = new int[15];

    for (int i = 0; i < 15; i++) {
      numeroEnteroAletorio[i] = (int) (Math.random() * 501);
    }

    System.out.println("Array Original");

    System.out.println("\n┌────────┬─────┬─────┬─────┬─────┬─────┬─────┬─────┬─────┬─────┬─────┬─────┬─────┬─────┬─────┬─────┐");
    System.out.print("│ Índice ");
    for (int i = 0; i < 15; i++) {
      System.out.printf("│%5d", i);
    }
    System.out.println("│\n├────────┼─────┼─────┼─────┼─────┼─────┼─────┼─────┼─────┼─────┼─────┼─────┼─────┼─────┼─────┼─────┤");
    System.out.print("│ Valor  ");
    for (int n : numeroEnteroAletorio) {
      System.out.printf("│%5d", n);
    }
    System.out.println("│\n└────────┴─────┴─────┴─────┴─────┴─────┴─────┴─────┴─────┴─────┴─────┴─────┴─────┴─────┴─────┴─────┘");

    //Transformación de los números en multiplo de 5
    int[] arrayResultado = new int[15];

    for (int i = 0; i < 15; i++) {
      arrayResultado[i] = numeroEnteroAletorio[i];

      if (numeroEnteroAletorio[i] % 5 == 1) {
        arrayResultado[i] = numeroEnteroAletorio[i] + 4;
      }

      if (numeroEnteroAletorio[i] % 5 == 2) {
        arrayResultado[i] = numeroEnteroAletorio[i] + 3;
      }

      if (numeroEnteroAletorio[i] % 5 == 3) {
        arrayResultado[i] = numeroEnteroAletorio[i] + 2;
      }

      if (numeroEnteroAletorio[i] % 5 == 4) {
        arrayResultado[i] = numeroEnteroAletorio[i] + 1;
      }
    }

    //Array Resultado
    System.out.println("Array Original");

    System.out.println("\n┌────────┬─────┬─────┬─────┬─────┬─────┬─────┬─────┬─────┬─────┬─────┬─────┬─────┬─────┬─────┬─────┐");
    System.out.print("│ Índice ");
    for (int i = 0; i < 15; i++) {
      System.out.printf("│%5d", i);
    }
    System.out.println("│\n├────────┼─────┼─────┼─────┼─────┼─────┼─────┼─────┼─────┼─────┼─────┼─────┼─────┼─────┼─────┼─────┤");
    System.out.print("│ Valor  ");
    for (int a : arrayResultado) {
      System.out.printf("│%5d", a);
    }
    System.out.println("│\n└────────┴─────┴─────┴─────┴─────┴─────┴─────┴─────┴─────┴─────┴─────┴─────┴─────┴─────┴─────┴─────┘");
  }
}
