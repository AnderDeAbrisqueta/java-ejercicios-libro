
package tema7;

import java.util.Scanner;

/**
 *
 * @author Ander De Abrisqueta Rangel
 */
public class Ejercicio19NumeroInsertado {

  /**
   * @param args the command line arguments
   */
  public static void main(String args[]) {
    //Construcción del array original
    int[] numeroEnteroAletorio = new int[11];

    for (int i = 0; i < 11; i++) {
      numeroEnteroAletorio[i] = (int) (Math.random() * 201);
    }

    System.out.println("Array Original");

    System.out.println("\n┌────────┬─────┬─────┬─────┬─────┬─────┬─────┬─────┬─────┬─────┬─────┬─────┐");
    System.out.print("│ Índice ");
    for (int i = 0; i < 11; i++) {
      System.out.printf("│%5d", i);
    }
    System.out.println("│\n├────────┼─────┼─────┼─────┼─────┼─────┼─────┼─────┼─────┼─────┼─────┼─────┤");
    System.out.print("│ Valor  ");
    for (int n : numeroEnteroAletorio) {
      System.out.printf("│%5d", n);
    }
    System.out.println("│\n└────────┴─────┴─────┴─────┴─────┴─────┴─────┴─────┴─────┴─────┴─────┴─────┘");

    Scanner s = new Scanner(System.in);
    
    System.out.print("Por favor, introduzca el número que quiere insertar: ");
    int numeroInsertar = Integer.parseInt(s.nextLine());
    
    System.out.print("Introduzca la posición donde lo quiere insertar (0 – 11): ");
    int posicionInsertar = Integer.parseInt(s.nextLine());
    
    System.out.println("");
    
    //Inserción del número
    int[] arrayResultado = new int[11];
    
    for (int i = 0; i < 11; i++) {
      arrayResultado[i] = numeroEnteroAletorio[i];
      
      if (i == posicionInsertar) {
        arrayResultado[i] = numeroInsertar;
      }
      
      if (i > posicionInsertar) {
        arrayResultado[i] = numeroEnteroAletorio[i - 1];
      }
    }
    
    System.out.println("Array Resultado");

    System.out.println("\n┌────────┬─────┬─────┬─────┬─────┬─────┬─────┬─────┬─────┬─────┬─────┬─────┐");
    System.out.print("│ Índice ");
    for (int i = 0; i < 11; i++) {
      System.out.printf("│%5d", i);
    }
    System.out.println("│\n├────────┼─────┼─────┼─────┼─────┼─────┼─────┼─────┼─────┼─────┼─────┼─────┤");
    System.out.print("│ Valor  ");
    for (int a : arrayResultado) {
      System.out.printf("│%5d", a);
    }
    System.out.println("│\n└────────┴─────┴─────┴─────┴─────┴─────┴─────┴─────┴─────┴─────┴─────┴─────┘");

    
  }
}
