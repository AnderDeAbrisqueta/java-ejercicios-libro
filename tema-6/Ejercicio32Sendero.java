package tema6;

import java.util.Scanner;

/**
 *
 * @author Ander De Abrisqueta Rangel
 */
public class Ejercicio32Sendero {

  /**
   * @param args the command line arguments
   */
  public static void main(String args[]) {
    Scanner s = new Scanner(System.in);

    boolean esLongitudCorrecta = true;
    int longitudSendero = 0;

    do {
      System.out.print("Por favor, introduzca la longitud del sendero: ");
      longitudSendero = Integer.parseInt(s.nextLine());

      if (longitudSendero > 2) {
        esLongitudCorrecta = false;

      }
    } while (esLongitudCorrecta);

    int posicionIzquierda = 12;
    int posicionDerecha = 14;

    System.out.println("");

    for (int i = 0; i < longitudSendero; i++) {
      int formaSendero = (int) (Math.random() * ((posicionDerecha - posicionIzquierda) + 1) + posicionIzquierda);
      for (int j = 1; j < formaSendero; j++) {
        System.out.print(" ");
      }

      System.out.print("|");
      //Espacios internos
      int hayObstaculos = (int) (Math.random() * 2);

      if (hayObstaculos == 0) {
        System.out.print("    ");

      } else {
        int tipoObstaculos = (int) (Math.random() * 2);

        if (tipoObstaculos == 0) {
          int posicionPlanta = (int) (Math.random() * 4);
          switch (posicionPlanta) {
            case 0:
              System.out.print("*   ");
              break;
            case 1:
              System.out.print(" *  ");
              break;
            case 2:
              System.out.print("  * ");
              break;
            case 3:
              System.out.print("   *");
              break;
            default:
          }//Fin del Switch

        } else {
          int posicionPiedra = (int) (Math.random() * 4);
          switch (posicionPiedra) {
            case 0:
              System.out.print("0   ");
              break;
            case 1:
              System.out.print(" 0  ");
              break;
            case 2:
              System.out.print("  0 ");
              break;
            case 3:
              System.out.print("   0");
              break;
            default:
          }//Fin del Switch
        }//Fin del else

      }//Fin del else

      System.out.print("|");
      System.out.println("");

      if (formaSendero == posicionIzquierda) {
        posicionIzquierda--;
        posicionDerecha--;
      } else if (formaSendero == posicionDerecha) {
        posicionIzquierda++;
        posicionDerecha++;
      }

    }// Fin del for

  }
}
