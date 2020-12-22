package tema6;

import java.util.Scanner;

/**
 * Escribe un programa que muestre 50 números enteros aleatorios comprendidos
 * entre el -100 y el 200 ambos incluidos y separados por espacios. Muestra
 * luego el máximo de los pares el mínimo de los impares y la media de todos los
 * números generados.
 *
 * @author Ander De Abrisqueta Rangel
 */
public class Ejercicio19NumeroAleatoriosCalculosVarios {

  /**
   * @param args the command line arguments
   */
  public static void main(String args[]) {
    Scanner s = new Scanner(System.in);

    int maximoNumeroPar = -100;
    int numeroPar = 0;
    int minimoNumeroImpar = 199;
    int numeroImpar = 0;
    int media = 0;
    int sumaNumerosAleatorios = 0;
    
    System.out.print("Números aleatorios: ");

    for (int i = 1; i < 51; i++) {

      int numerosAletorios = (int) (Math.random() * ((200 + 100) + 1) - 100);
      System.out.print(numerosAletorios + " ");

      if (numerosAletorios % 2 == 0) {
        numeroPar = numerosAletorios;
        if (numeroPar > maximoNumeroPar) {
          maximoNumeroPar = numeroPar;
        }

      } else {
        numeroImpar = numerosAletorios;
        if (numeroImpar < minimoNumeroImpar) {
          minimoNumeroImpar = numeroImpar;

        }
      }

      sumaNumerosAleatorios += numerosAletorios;
      media = sumaNumerosAleatorios / i;

    }// Fin del for
    System.out.println("");
    System.out.println("Resultados:");
    System.out.println("El mayor de los números pares es: " + maximoNumeroPar);
    System.out.println("El menor de los números impares es: " + minimoNumeroImpar);
    System.out.println("La media es: " + media);

  }
}
