package tema5;

import java.util.Scanner;

/**
 *
 * @author Ander De Abrisqueta Rangel
 */
public class Ejercicio64RectanguoHueco {

  /**
   * @param args the command line arguments
   */
  public static void main(String args[]) {
    Scanner s = new Scanner(System.in);

    int anchoRectangulo = 6;
    int altoRectangulo = 3;
    int opcionMenu = 0;

    do {
      //Construcción del rectángulo
      for (int i = 0; i < anchoRectangulo; i++) {
        System.out.print("*");
      }
      System.out.println("");

      for (int i = 0; i < altoRectangulo - 2; i++) {
        System.out.print("*");
        for (int j = 0; j < anchoRectangulo - 2; j++) {
          System.out.print(" ");
        }
        System.out.println("*");
      }

      for (int i = 0; i < anchoRectangulo; i++) {
        System.out.print("*");
      }
      System.out.println("");

      //Menú
      System.out.println("1. Agrandarlo");
      System.out.println("2. Achicarlo");
      System.out.println("3. Cambiar la orientación");
      System.out.println("4. Salir");
      System.out.print("Indique qué quiere hacer con el rectángulo: ");
      opcionMenu = Integer.parseInt(s.nextLine());

      switch (opcionMenu) {
        case 1:
          anchoRectangulo++;
          altoRectangulo++;
          break;

        case 2:
          if (altoRectangulo > 2 && anchoRectangulo > 2) {
            anchoRectangulo--;
            altoRectangulo--;
          }
          break;

        case 3:
          int cambioOrientacion = anchoRectangulo;
          anchoRectangulo = altoRectangulo;
          altoRectangulo = cambioOrientacion;
          break;
        default:
      }
      System.out.println("");

    } while (opcionMenu != 4);
  }
}
