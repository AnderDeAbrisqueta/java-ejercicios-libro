package ex03adar;

import java.util.Scanner;

/**
 * Examen Programación
 *
 * 16/12/2020
 *
 * DAM 1
 *
 * Ejercicio 1:
 *
 * @author Ander De Abrisqueta Rangel
 */
public class Ex03adar1 {

  /**
   * @param args the command line arguments
   */
  public static void main(String args[]) {
    Scanner s = new Scanner(System.in);

    int contador = 0;
    boolean numeroPrimo;

    do {
      int numeroAleatorio = (int) (Math.random() * ((200 - 2) + 1) + 2);
      numeroPrimo = true;

      for (int j = 2; j < numeroAleatorio; j++) {

        double evaluacionNumero = numeroAleatorio % j;

        if (evaluacionNumero == 0) {
          numeroPrimo = false;
        }
      } // Final del for

      if (numeroAleatorio % 2 != 0) {
        System.out.print(numeroAleatorio + " ");
        contador++;
      }

    } while (!numeroPrimo);
    
    if (contador == 1) {
      System.out.println("\nSe ha generado " + contador + " número impar aleatorio");
      
    } else {
      System.out.println("\nSe han generado " + contador + " números impares aleatorios");
    }

    
  }
}
