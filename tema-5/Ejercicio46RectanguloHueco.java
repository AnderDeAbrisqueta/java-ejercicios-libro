package tema5;

import java.util.Scanner;

/**
 *
 * @author Ander De Abrisqueta Rangel
 */
public class Ejercicio46RectanguloHueco {

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
      System.out.print("Por favor, introduzca la altura del rectángulo (como mínimo 2): ");
      altura = Integer.parseInt(s.nextLine());

      System.out.print("Ahora introduzca la anchura (como mínimo 2): ");
      anchura = Integer.parseInt(s.nextLine());
      System.out.println("");

      if ((altura >= 2) && (anchura >= 2)) {
        esUnaAlturaCorrecta = true;
        esUnaAnchuraCorrecta = true;

      }

    } while (!esUnaAlturaCorrecta && !esUnaAnchuraCorrecta);

    int parteCentralRectangulo = 0;


    //Tope rectángulo
    for (int i = 0; i < anchura; i++) {
      System.out.print("*");

    }
    System.out.println("");

    //Centro del rectángulo
    for (int i = 0; i < altura - 2; i++) {
      System.out.print("*");
      for (int j = 0; j < anchura - 2; j++) {
          System.out.print(" ");

      }
      System.out.print("*");
      System.out.println("");

    }
    //Base del rectángulo
    for (int i = 0; i < anchura; i++) {
      System.out.print("*");

    }
    System.out.println("");

  }
}
