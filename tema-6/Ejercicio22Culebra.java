package tema6;

import java.util.Scanner;

/**
 * Realiza un programa que pinte por pantalla una serpiente con un “serpenteo”
 * aleatorio. La cabeza se representará con el carácter @ y se debe colocar
 * exactamente en la posición 13 (con 12 espacios delante).
 *
 * @author Ander De Abrisqueta Rangel
 */
public class Ejercicio22Culebra {

  /**
   * @param args the command line arguments
   */
  public static void main(String args[]) {
    Scanner s = new Scanner(System.in);

    boolean esLongitudCorrecta = true;
    int longitudSerpiente = 0;

    do {
      System.out.print("Por favor, introduzca la longitud de la serpiente en caracteres contando la cabeza: ");
      longitudSerpiente = Integer.parseInt(s.nextLine());

      if (longitudSerpiente > 2) {
        esLongitudCorrecta = false;

      }
    } while (esLongitudCorrecta);

    int posicionIzquierda = 12;
    int posicionDerecha = 14;

    System.out.println("");
    System.out.println("            @");

    for (int i = 1; i < longitudSerpiente; i++) {
      int cuerpoSerpiente = (int) (Math.random() * ((posicionDerecha - posicionIzquierda) + 1) + posicionIzquierda);
      for (int j = 1; j < cuerpoSerpiente; j++) {
        System.out.print(" ");
      }
      System.out.println("*");

      if (cuerpoSerpiente == posicionIzquierda) {
        posicionIzquierda--;
        posicionDerecha--;
      } else if (cuerpoSerpiente == posicionDerecha) {
        posicionIzquierda++;
        posicionDerecha++;
      }

    }// Fin del for

  }
}
