
package tema7;

import java.util.Scanner;

/**
 *
 * @author Ander De Abrisqueta Rangel
 */
public class Ejercicio22ArrayFueraHaciaDentro {

  /**
   * @param args the command line arguments
   */
  public static void main(String args[]) {
    //Construcción del array
    Scanner s = new Scanner(System.in);
    
    System.out.print("Por favor, introduzca el tamaño del array: ");
    int tamanoArray = Integer.parseInt(s.nextLine());
    
    System.out.println("Array Original");
    
    System.out.print("┌────────┬");
    
    for (int i = 1; i < tamanoArray; i++) {
      System.out.print("─────┬");
    }
    System.out.print("─────┐\n");
    System.out.print("│ Índice ");
    for (int i = 0; i < tamanoArray; i++) {
      System.out.printf("│%5d", i);
    }
    System.out.println("│");
    System.out.print("├────────┼");
    for (int i = 1; i < tamanoArray; i++) {
      System.out.print("─────┼");
    }
    System.out.print("─────┤\n");
    System.out.print("│ Valor  ");
    
    int[] numeroEnteroAletorio = new int[tamanoArray];

    for (int i = 0; i < tamanoArray; i++) {
      numeroEnteroAletorio[i] = (int) (Math.random() * 201);
    }
    
    for (int n : numeroEnteroAletorio) {
      System.out.printf("│%5d", n);
    }
    System.out.println("│");
    System.out.print("└────────┴");
    for (int i = 1; i < tamanoArray; i++) {
      System.out.print("─────┴");
    }
    System.out.print("─────┘\n");
    
    //Movimiento del array de fuera hacia dentro
    int[] arrayResultado = new int[tamanoArray];
    int indicesPares = 1;
    int indicesImpares = 0;
    
    arrayResultado[0] = numeroEnteroAletorio[0];
    for (int i = 1; i < tamanoArray; i++) {
      if (i % 2 == 0) {
        arrayResultado[i - indicesPares] = numeroEnteroAletorio[i];
        indicesPares++;
      }
      if (i % 2 != 0) {
        arrayResultado[(tamanoArray - 1) - indicesImpares] = numeroEnteroAletorio[i];
        indicesImpares++;
      }
    }
    
    
    //Construcción del array resultado
    System.out.println("Array Resultado");
    
    System.out.print("┌────────┬");
    
    for (int i = 1; i < tamanoArray; i++) {
      System.out.print("─────┬");
    }
    System.out.print("─────┐\n");
    System.out.print("│ Índice ");
    for (int i = 0; i < tamanoArray; i++) {
      System.out.printf("│%5d", i);
    }
    System.out.println("│");
    System.out.print("├────────┼");
    for (int i = 1; i < tamanoArray; i++) {
      System.out.print("─────┼");
    }
    System.out.print("─────┤\n");
    System.out.print("│ Valor  ");
    
    for (int a : arrayResultado) {
      System.out.printf("│%5d", a);
    }
    System.out.println("│");
    System.out.print("└────────┴");
    for (int i = 1; i < tamanoArray; i++) {
      System.out.print("─────┴");
    }
    System.out.print("─────┘\n");
  }
}
