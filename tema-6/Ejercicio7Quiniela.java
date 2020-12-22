package tema6;

import java.util.Scanner;

/**
 * Escribe un programa que muestre tres apuestas de la quiniela en tres columnas
 * para los 14 partidos y el pleno al quince (15 filas).
 *
 * @author Ander De Abrisqueta Rangel
 */
public class Ejercicio7Quiniela {

  /**
   * @param args the command line arguments
   */
  public static void main(String args[]) {
    Scanner s = new Scanner(System.in);

    String empate = "X";

    for (int i = 1; i < 15; i++) {
      System.out.print("Partido " + i);

      if (i < 10) {
        System.out.print(" | ");
      } else {
        System.out.print("| ");
      }

      for (int j = 0; j < 3; j++) {
        int pronostico = (int) (Math.random() * 3);

        if (pronostico == 0) {
          System.out.print(" " + empate + "  |  ");

        } else {
          System.out.print(" " + pronostico + "  |  ");

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
