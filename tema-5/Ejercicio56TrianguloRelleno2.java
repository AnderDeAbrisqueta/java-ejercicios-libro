package tema5;

import java.util.Scanner;

/**
 *
 * @author Ander De Abrisqueta
 */
public class Ejercicio56TrianguloRelleno2 {

  /**
   * @param args the command line arguments
   */
  public static void main(String args[]) {
    Scanner s = new Scanner(System.in);

    System.out.print("Introduzca la altura de la figura: ");
    int altura = Integer.parseInt(s.nextLine());

    for (int i = 0; i < altura; i++) {
      for (int j = 0; j < i ; j++) {
        System.out.print(" "); 
      }
      for (int j = 0; j < altura - i; j++) {
        System.out.print("*");
      }
      System.out.println("");
    }

  }
}
