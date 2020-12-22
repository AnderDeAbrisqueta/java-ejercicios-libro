package tema6;

import java.util.Scanner;

/**
 * Realiza un programa que pinte por pantalla diez líneas formadas por
 * caracteres. El carácter con el que se pinta cada línea se elige de forma
 * aleatoria entre uno de los siguientes: *, -, =, ., |, @. Las líneas deben
 * tener una longitud aleatoria entre 1 y 40 caracteres.
 *
 * @author Ander De Abrisqueta Rangel
 */
public class Ejercicio10LineasCaracteres {

  /**
   * @param args the command line arguments
   */
  public static void main(String args[]) {
    Scanner s = new Scanner(System.in);

    int salida = 0;
    int longitud = 0;

    for (int i = 0; i < 10; i++) {
      longitud = (int) ((Math.random() * 41) + 1);
      int caracter = (int) (Math.random() * 6);

      for (int j = 0; j < longitud; j++) {
        switch (caracter) {
          case 0:
            System.out.print("*");
            break;

          case 1:
            System.out.print("-");
            break;

          case 2:
            System.out.print("=");
            break;

          case 3:
            System.out.print(".");
            break;

          case 4:
            System.out.print("|");
            break;

          case 5:
            System.out.print("@");
            break;
          default:

        }
      }

      System.out.println("");

    }

  }
}
