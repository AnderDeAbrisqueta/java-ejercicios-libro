
package tema7;

import java.util.Scanner;

/**
 *
 * @author Ander De Abrisqueta Rangel
 */
public class Ejercicio12ArrayCambioPosicion {

  /**
   * @param args the command line arguments
   */
  public static void main(String args[]) {
    Scanner s = new Scanner(System.in);
    int[] indice = new int[10];
    int[] valor = new int[10];
    int i;
    
    System.out.println("Por favor, introduce 10 valores enteros");
    //Construcción del array original
    for (i = 0; i < 10; i++) {
      indice[i] = i;
      System.out.print("Valor " + "[" + i + "]: ");
      valor[i] = Integer.parseInt(s.nextLine());
    }
    
    System.out.println("Array Original");
    System.out.println("\n┌────────┬─────┬─────┬─────┬─────┬─────┬─────┬─────┬─────┬─────┬─────┐");
    System.out.print("│ Índice ");
    for (i = 0; i < 10; i++) {
      System.out.printf("│%5d", indice[i]);
    }
    System.out.println("│\n├────────┼─────┼─────┼─────┼─────┼─────┼─────┼─────┼─────┼─────┼─────┤");
    System.out.print("│ Valor  ");
    for (i = 0; i < 10; i++) {
      System.out.printf("│%5d", valor[i]);
    }
    System.out.println("│\n└────────┴─────┴─────┴─────┴─────┴─────┴─────┴─────┴─────┴─────┴─────┘");

    //Elección del número y posición a cambiar
    boolean sonCorrectosLosDatos = true;
    int indiceMover;
    int indiceDesplazar;
    
    do { 
      sonCorrectosLosDatos = true;
      
      System.out.print("Por favor, introduzca el indice del valor que va a mover: ");
      indiceMover = Integer.parseInt(s.nextLine());
      
      if (indiceMover < 0 || indiceMover > 9) {
        sonCorrectosLosDatos = false; 
        System.out.println("Por favor, introduzca un valor comprendido entre 0 y 9.");
      }
    
      System.out.print("Por favor, introduzca el indice hacia donde se desplaza: ");
      indiceDesplazar = Integer.parseInt(s.nextLine());
      
      if (indiceDesplazar < 0 || indiceDesplazar > 9) {
        sonCorrectosLosDatos = false; 
        System.out.println("Por favor, introduzca un valor comprendido entre 0 y 9.");
      }
      
      if (indiceMover >= indiceDesplazar) {
        sonCorrectosLosDatos = false;
        System.out.println("El índice inicial debe ser menor que el índice final.");
      }
      
    } while (!sonCorrectosLosDatos);
    
    
    //Rotación de numeros
    int[] valorFinal = new int[10];
    
    for (i = 0; i < 10; i++) {
      valorFinal[i] = valor[i];
    }
    
    valorFinal[indiceDesplazar] = valor[indiceMover];
    
    for (i = indiceDesplazar + 1; i < 10; i++) {
      valorFinal[i] = valor[i - 1];
    }
    
    valorFinal[0] = valor[9];
    
    for (i = 0; i < indiceMover; i++) {
      valorFinal[i + 1] = valor[i];
    }
    System.out.println("Array movido");
    System.out.println("\n┌────────┬─────┬─────┬─────┬─────┬─────┬─────┬─────┬─────┬─────┬─────┐");
    System.out.print("│ Índice ");
    for (i = 0; i < 10; i++) {
      System.out.printf("│%5d", indice[i]);
    }
    System.out.println("│\n├────────┼─────┼─────┼─────┼─────┼─────┼─────┼─────┼─────┼─────┼─────┤");
    System.out.print("│ Valor  ");
    for (i = 0; i < 10; i++) {
      System.out.printf("│%5d", valorFinal[i]);
    }
    System.out.println("│\n└────────┴─────┴─────┴─────┴─────┴─────┴─────┴─────┴─────┴─────┴─────┘");

  }
}
