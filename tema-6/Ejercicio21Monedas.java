package tema6;

import java.util.Scanner;

/**
 * Realiza un programa que genere una secuencia de cinco monedas de curso legal
 * lanzadas al aire. Las monedas disponibles son de 1 céntimo, 2 céntimos, 5
 * céntimos, 10 céntimos, 20 céntimos, 50 céntimos, 1 euro y 2 euros. Las dos
 * posiciones posibles son cara y cruz.
 *
 * @author Ander De Abrisqueta Rangel
 */
public class Ejercicio21Monedas {

  /**
   * @param args the command line arguments
   */
  public static void main(String args[]) {
    Scanner s = new Scanner(System.in);

    System.out.println("Las monedas son:");

    for (int i = 0; i < 5; i++) {
      int lanzamientoModeda = (int) (Math.random() * 8);

      switch (lanzamientoModeda) {
        case 0:
          System.out.print("  1  céntimo ");
          break;
          
        case 1: 
          System.out.print("  2 céntimos ");
          break;

        case 2:
          System.out.print("  5 céntimos ");
          break;

        case 3:
          System.out.print(" 10 céntimos ");
          break;

        case 4:
          System.out.print(" 20 céntimos ");
          break;

        case 5:
          System.out.print(" 50 céntimos ");
          break;

        case 6:
          System.out.print("  1 € ");
          break;

        case 7:
          System.out.print("  2 € ");
          break;
        default:

      }// Fin del switch

      int caraCruz = (int) (Math.random() * 2);

      if (caraCruz == 0) {
        System.out.print("- cara");

      } else {
        System.out.print("- cruz");

      }

      System.out.println("");

    }// Fin del for
  }
}
