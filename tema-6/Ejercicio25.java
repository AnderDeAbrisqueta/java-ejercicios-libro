package tema6;

import java.util.Scanner;

/**
 * Escribe un programa que muestre por pantalla 100 números enteros separados
 * por un espacio. Los números deben estar generados de forma aleatoria en un
 * rango entre 10 y 200 ambos incluidos. Los primos deben aparecer entre
 * almohadillas (p. ej. #19#) y los múltiplos de 5 entre corchetes (p. ej.
 * [25]).
 *
 * @author alumno
 */
public class Ejercicio25 {

  /**
   * @param args the command line arguments
   */
  public static void main(String args[]) {
    Scanner s = new Scanner(System.in);

    for (int i = 0; i < 100; i++) {
      int numerosAleatorios = (int) (Math.random() * ((200 - 10) + 1) + 10);

      boolean numeroPrimo = true;
      for (int j = 2; j < numerosAleatorios; j++) {

        double evaluacionNumero = numerosAleatorios % j;

        if (evaluacionNumero == 0) {
          numeroPrimo = false;
        }
      } // Final del for

      if (numeroPrimo) {
        System.out.print("#" + numerosAleatorios + "#" + " ");

      } else if (numerosAleatorios % 5 == 0) {
        System.out.print("[" + numerosAleatorios + "]" + " ");

      } else {
        System.out.print(" " + numerosAleatorios + " ");
      }
    } // Final del for
    System.out.println("");
  }
}
