package tema6;

import java.util.Scanner;

/**
 *
 * @author Ander De Abrisqueta Rangel
 */
public class Ejercicio30Pecera2 {

  /**
   * @param args the command line arguments
   */
  public static void main(String args[]) {
    Scanner s = new Scanner(System.in);

    int altura = 0;
    int anchura = 0;

    boolean esUnaAlturaCorrecta = false;
    boolean esUnaAnchuraCorrecta = false;

    //Comprobación de la entrada de datos
    do {
      System.out.print("Por favor, introduzca la altura de la pecera (como mínimo 4): ");
      altura = Integer.parseInt(s.nextLine());

      System.out.print("Ahora introduzca la anchura (como mínimo 4): ");
      anchura = Integer.parseInt(s.nextLine());
      System.out.println("");

      if ((altura >= 4) && (anchura >= 4)) {
        esUnaAlturaCorrecta = true;
        esUnaAnchuraCorrecta = true;

      }

    } while (!esUnaAlturaCorrecta && !esUnaAnchuraCorrecta);

    int parteCentralPecera = 0;
    int posicionPez;
    int posicionCaballitoMar;
    int posicionCaracola;

    do {
      posicionPez = (int) (Math.random() * (altura - 2) * (anchura - 2));
      posicionCaballitoMar = (int) (Math.random() * (altura - 2) * (anchura - 2));
      posicionCaracola = (int) (Math.random() * (altura - 2) * (anchura - 2));

    } while (posicionPez == posicionCaballitoMar || posicionPez == posicionCaracola || posicionCaballitoMar == posicionCaracola);

    //Tope pecera
    for (int i = 0; i < anchura; i++) {
      System.out.print("*");

    }
    System.out.println("");

    //Centro de la pecera
    for (int i = 0; i < altura - 2; i++) {
      System.out.print("*");
      for (int j = 0; j < anchura - 2; j++) {
        if (parteCentralPecera == posicionPez) {
          System.out.print("&");
        } else if (parteCentralPecera == posicionCaballitoMar) {
          System.out.print("$");
        } else if (parteCentralPecera == posicionCaracola) {
          System.out.print("@");

        } else {
          System.out.print(" ");
        }
        parteCentralPecera++;
      }
      System.out.print("*");
      System.out.println("");

    }
    //Base pecera
    for (int i = 0; i < anchura; i++) {
      System.out.print("*");

    }
    System.out.println("");

  }
}
