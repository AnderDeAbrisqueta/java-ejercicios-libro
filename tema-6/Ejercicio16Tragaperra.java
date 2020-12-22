package tema6;

import java.util.Scanner;

/**
 *
 * @author Ander De Abrisqueta Rangel
 */
public class Ejercicio16Tragaperra {

  /**
   * @param args the command line arguments
   */
  public static void main(String args[]) {
    Scanner s = new Scanner(System.in);

    int figura = 0;
    int figura1 = 0;
    int figura2 = 0;
    int figura3 = 0;

    for (int i = 0; i < 3; i++) {
      figura = (int) (Math.random() * 5);

      switch (figura) {
        case 0:
          System.out.print(" Corazón ");
          break;

        case 1:
          System.out.print(" Diamante ");
          break;

        case 2:
          System.out.print(" Herradura ");
          break;

        case 3:
          System.out.print(" Campana ");
          break;

        case 4:
          System.out.print(" Limón ");

      }

      switch (i) {
        case 0:
          figura1 = figura;
          break;

        case 1:
          figura2 = figura;
          break;

        case 2:
          figura3 = figura;
          break;
        default:

      }
    }
    System.out.println("");

    if ((figura1 == figura2) && (figura2 == figura3) && (figura1 == figura3)) {
      System.out.println(" Enhorabuena, ha ganado 10 monedas");

    } else if ((figura1 != figura2) && (figura2 != figura3) && (figura1 != figura3)) {
      System.out.println(" Lo siento, ha perdido");

    } else {
      System.out.println(" Bien, ha recuperado su moneda");
    }
  }
}
