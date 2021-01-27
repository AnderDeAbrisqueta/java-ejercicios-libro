package tema7;

import java.util.Scanner;

/**
 *
 * @author Ander De Abrisqueta Rangel
 */
public class Ejercicio09ParImpar {

  /**
   * @param args the command line arguments
   */
  public static void main(String args[]) {
    Scanner s = new Scanner(System.in);

    int numero[] = new int[8];

    System.out.println("Por favor, introduzca 8 número enteros");
    int i;
    for (i = 0; i < 8; i++) {
      System.out.print("Número [" + i + "]: ");
      numero[i] = Integer.parseInt(s.nextLine());
    }
    
    for (i = 0; i < 8; i++) {
      if (numero[i] % 2 == 0) {
        System.out.println(numero[i] + " es un número par");
      } else {
        System.out.println(numero[i] + " es un número impar");
      }
      
    }
  }
}
