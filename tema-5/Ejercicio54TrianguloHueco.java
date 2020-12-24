package tema5;

import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class Ejercicio54TrianguloHueco {

  /**
   * @param args the command line arguments
   */
  public static void main(String args[]) {
    Scanner s = new Scanner(System.in);

    System.out.print("Introduzca la altura de la figura: ");
    int altura = Integer.parseInt(s.nextLine());

    for (int j = 0; j < altura; j++) {
      System.out.print("*");

    }
    System.out.println("");
    
    for (int i = 1; i < altura - 1; i++) {
      System.out.print("*");
      for (int j = 0; j < altura - i - 2; j++) {
        System.out.print(" ");

      }
      System.out.print("*");
      System.out.println("");
    }
    System.out.println("*");
  }
}
