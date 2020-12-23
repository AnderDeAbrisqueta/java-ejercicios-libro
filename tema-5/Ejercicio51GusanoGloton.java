package tema5;

import java.util.Scanner;

/**
 *
 * @author Ander De Abrisqueta Rangel
 */
public class Ejercicio51GusanoGloton {

  /**
   * @param args the command line arguments
   */
  public static void main(String args[]) {
    Scanner s = new Scanner(System.in);

    System.out.print("Introduzca un número entero (mayor que cero): ");
    long numeroIntroducido = Long.parseLong(s.nextLine());

    long numero = numeroIntroducido;
    long numeroInverso = 0;

    while (numero > 0) {
      if ((numero % 10 != 0) && (numero % 10 != 8)) {
        numeroInverso = (numeroInverso * 10) + (numero % 10);
      }

      numero /= 10;
    }
    numero = numeroInverso;
    numeroInverso = 0;

    while (numero > 0) {
      numeroInverso = (numeroInverso * 10) + (numero % 10);
      numero /= 10;
    }

    if (numeroInverso != numeroIntroducido) {
      System.out.print("Después de haber sido comido por el gusano numérico se queda en ");
      System.out.println(numeroInverso);
    } else {
      System.out.println("El gusano numérico no se ha comido ningún dígito.");
    }

  }
}
