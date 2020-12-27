package tema5;

import java.util.Scanner;

/**
 *
 * @author Ander De Abrisqueta Rangel
 */
public class Ejercicio66flecha {

  public static void main(String args[]) {
    Scanner s = new Scanner(System.in);

    boolean sonDatosCorrectos = false;
    int altura = 0;

    do {

      System.out.print("Por favor, introduzca la altura de la figura ");
      System.out.print("(un número mayor o igual a 3 e impar): ");
      altura = Integer.parseInt(s.nextLine());

      if (altura >= 3 && altura % 2 != 0) {
        sonDatosCorrectos = true;
      } else {
        System.out.println("La altura debe ser mayor o igual a 3 e impar");
      }

    } while (!sonDatosCorrectos);

    for (int i = 0; i < altura / 2 + 1; i++) {
      for (int j = 0; j < i; j++) {
        System.out.print(" ");
      }
      System.out.print("*    *");
      System.out.println("");

    }
    
    for (int i = 0; i < altura / 2; i++) {
      for (int j = altura - altura / 2; j < altura - i - 1; j++) {
        System.out.print(" ");
      }
      System.out.println("*    *");
    }
  }
}
