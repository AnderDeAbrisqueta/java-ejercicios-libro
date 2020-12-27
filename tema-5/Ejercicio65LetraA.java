package tema5;

import java.util.Scanner;

/**
 *
 * @author Ander De Abrisqueta Rangel
 */
public class Ejercicio65LetraA {

  /**
   * @param args the command line arguments
   */
  public static void main(String args[]) {
    Scanner s = new Scanner(System.in);

    boolean sonDatosCorrectos = false;
    int altura = 0;
    int palito = 0;

    do {

      System.out.print("Por favor, introduzca la altura de la A ");
      System.out.print("(un número mayor o igual a 3): ");
      altura = Integer.parseInt(s.nextLine());

      if (altura >= 3) {
        System.out.print("Por favor, introduzca la fila del palito horizontal ");
        System.out.print("((entre 2 y " + (altura - 1) + "): ");
        palito = Integer.parseInt(s.nextLine());

        if (palito >= 2 && palito <= (altura - 1)) {
          sonDatosCorrectos = true;

        } else {
          System.out.println("La fila introducida no es correcta.");
        }

      } else {
        System.out.println("La altura debe ser mayor o igual a 3");
      }

    } while (!sonDatosCorrectos);

    int espaciosIzq = altura - 1;
    int espaciosCentro = 1;

    for (int fila = 1; fila <= altura; fila++) {
      repiteCaracter(" ", espaciosIzq--);
      System.out.print("*");
      if (fila > 1) {
        if (fila == palito) {
          repiteCaracter("*", espaciosCentro);
        } else {
          repiteCaracter(" ", espaciosCentro);
        }

        espaciosCentro += 2;
        System.out.print("*");
      }
      System.out.println();
    }
  }

  public static void repiteCaracter(String c, int n) {
    for (int i = 0; i < n; i++) {
      System.out.print(c);
    }
  }

}
