package tema5;

import java.util.Scanner;

/**
 *
 * @author Ander De Abrisqueta
 */
public class Ejercicio50Diseno155 {

  /**
   * @param args the command line arguments
   */
  public static void main(String args[]) {
    Scanner s = new Scanner(System.in);

    //Comprobación de datos
    boolean datosCorrectos = false;
    int altura = 0;
    int espacios = 0;

    do {
      System.out.print("Introduzca la altura (5 como mínimo): ");
      altura = Integer.parseInt(s.nextLine());

      if (altura >= 5) {
        do {
          System.out.print("Espacios entre los números (1 como mínimo): ");
          espacios = Integer.parseInt(s.nextLine());
          if (espacios >= 1) {
            datosCorrectos = true;
          }
        } while (!datosCorrectos);

      }

    } while (!datosCorrectos);

    //Mitad superior
    //Primera línea
    System.out.print("*");

    for (int i = 0; i < espacios; i++) {
      System.out.print(" ");
    }

    System.out.print("****");

    for (int i = 0; i < espacios; i++) {
      System.out.print(" ");
    }

    System.out.println("****");

    //Segunda línea
    System.out.print("*");

    for (int i = 0; i < espacios; i++) {
      System.out.print(" ");
    }

    System.out.print("*   ");

    for (int i = 0; i < espacios; i++) {
      System.out.print(" ");
    }

    System.out.println("*   ");

    //Tercera línea
    System.out.print("*");

    for (int i = 0; i < espacios; i++) {
      System.out.print(" ");
    }

    System.out.print("****");

    for (int i = 0; i < espacios; i++) {
      System.out.print(" ");
    }

    System.out.println("****");

    //Segunda Mitad
    for (int i = 0; i < altura - 4; i++) {
      System.out.print("*");
      
      for (int j = 0; j < espacios; j++) {
        System.out.print(" ");
      }
      System.out.print("   *");
      
      for (int j = 0; j < espacios; j++) {
        System.out.print(" ");
      }
      System.out.println("   *");
    }
    //Línea final
    System.out.print("*");

    for (int i = 0; i < espacios; i++) {
      System.out.print(" ");
    }

    System.out.print("****");

    for (int i = 0; i < espacios; i++) {
      System.out.print(" ");
    }

    System.out.println("****");

  }
}
