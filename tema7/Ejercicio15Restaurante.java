package tema7;

import java.util.Scanner;

/**
 *
 * @author Ander De Abrisqueta Rangel
 */
public class Ejercicio15Restaurante {

  /**
   * @param args the command line arguments
   */
  public static void main(String args[]) {
    Scanner s = new Scanner(System.in);

    int[] ocupacion = new int[10];

    for (int i = 0; i < 10; i++) {
      ocupacion[i] = (int) (Math.random() * 5);
    }

    int numeroComensales;

    do {
      System.out.println("\n┌─────────┬─────┬─────┬─────┬─────┬─────┬─────┬─────┬─────┬─────┬─────┐");
      System.out.print("│ Mesa #  ");
      for (int i = 1; i < 11; i++) {
        System.out.printf("│%4d ", i);
      }
      System.out.println("│\n├─────────┼─────┼─────┼─────┼─────┼─────┼─────┼─────┼─────┼─────┼─────┤");
      System.out.print("│Ocupación");
      for (int i = 0; i < 10; i++) {
        System.out.printf("│%4d ", ocupacion[i]);
      }
      System.out.println("│\n└─────────┴─────┴─────┴─────┴─────┴─────┴─────┴─────┴─────┴─────┴─────┘");

      System.out.println("");
      System.out.print("Muy buenas, bienvenidos a Mi Casita, cuántos son \n"
              + "(Introduzca -1 para salir del programa): ");
      numeroComensales = Integer.parseInt(s.nextLine());
      System.out.println("\n");

      if (numeroComensales > 4) {
        System.out.println("Lo siento, no admitimos grupos mayores de cuatro personas, \n"
                + "haga grupos de 4 personas como máximo e intente de nuevo\n");
      } else {
        int indiceMesaVacia = 0;
        boolean hayMesaVacia = false;

        for (int i = 9; i >= 0; i--) {
          if (ocupacion[i] == 0) {
            indiceMesaVacia = i;
            hayMesaVacia = true;
          }
        }

        if (hayMesaVacia) {
          ocupacion[indiceMesaVacia] = numeroComensales;
          System.out.println("Por favor, siéntense en la mesa número " + (indiceMesaVacia + 1) + ".");
        } else {
          int indiceDisponibilidad = 0;
          boolean hayDisponibilidad = false;

          for (int i = 9; i >= 0; i--) {
            if (numeroComensales <= (4 - ocupacion[i])) {
              indiceDisponibilidad = i;
              hayDisponibilidad = true;
            }
          }

          if (hayDisponibilidad) {
            ocupacion[indiceDisponibilidad] += numeroComensales;
            System.out.println("Tendrán que compartir mesa. Por favor, siéntense en la mesa número " + (indiceDisponibilidad + 1) + ".");
          } else {
            System.out.println("Lo siento, en estos momentos no queda sitio.");
          }

        }
      }

    } while (numeroComensales != -1);
    
    System.out.println("Gracias. Hasta pronto.");
  }
}
