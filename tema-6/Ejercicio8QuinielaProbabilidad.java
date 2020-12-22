package tema5;

import java.util.Scanner;

/**
 * Modifica el programa anterior para que la probabilidad de que salga un 1 sea
 * de 1/2, la probabilidad de que salga x sea de 1/3 y la probabilidad de que
 * salga 2 sea de 1/6. Pista: 1/2 = 3/6 y 1/3 = 2/6.
 *
 * @author Ander De Abrisqueta Rangel
 */
public class Ejercicio8QuinielaProbabilidad {

  /**
   * @param args the command line arguments
   */
  public static void main(String args[]) {
    Scanner s = new Scanner(System.in);

    for (int i = 1; i < 15; i++) {
      System.out.print("Partido " + i);

      if (i < 10) {
        System.out.print("  | ");
      } else {
        System.out.print(" | ");
      }

      for (int j = 0; j < 3; j++) {
        int pronostico = (int) ((Math.random() * 6) + 1);

        switch (pronostico) {
          case 1:
          case 2:
          case 3:
            System.out.print("  1  |");
            break;

          case 4:
          case 5:
            System.out.print("  X  |");
            break;

          case 6:
            System.out.print("  2  |");
            break;
          default:

        }

      }//Final del for interno
      System.out.println("");
    }//Final del primer for

    //Pleno
    System.out.println("");
    System.out.print("Pleno al 15: Equipo A ");
    int golesEquipo1 = (int) (Math.random() * 4);
    if (golesEquipo1 == 3) {
      System.out.print("M");

    } else {
      System.out.print(golesEquipo1 + " ");
    }

    System.out.print(" Equipo B ");
    int golesEquipo2 = (int) (Math.random() * 4);
    if (golesEquipo2 == 3) {
      System.out.print("M");

    } else {
      System.out.print(golesEquipo2 + " ");
    }
    System.out.println("");

  }
}
