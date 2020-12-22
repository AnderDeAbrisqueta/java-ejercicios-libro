package tema5;

import java.util.Scanner;

/**
 *
 * @author Ander De Abrisqueta Rangel
 */
public class Ejercicio43CortarNumero {

  /**
   * @param args the command line arguments
   */
  public static void main(String args[]) {
    Scanner s = new Scanner(System.in);

    System.out.print("Por favor, introduzca un número entero positivo: ");
    long numeroIntroducido = Long.parseLong(s.nextLine());

    System.out.print("Introduzca la posición a partir de la cual quiere partir el número: ");
    int posicionPartir = Integer.parseInt(s.nextLine());

    long numero = numeroIntroducido;
    int longitud = 0;

    System.out.println("");

    //Longitud
    while (numero > 0) {
      numero /= 10;
      longitud++;
    }

    long numeroPartido1 = (long) (numeroIntroducido / Math.pow(10, longitud - posicionPartir + 1));
    long numeroPartido2 = (long) (numeroIntroducido % (Math.pow(10, longitud - posicionPartir + 1)));

    System.out.println("Los números partidos son el " + numeroPartido1 + " y el " + numeroPartido2);

  }
}
