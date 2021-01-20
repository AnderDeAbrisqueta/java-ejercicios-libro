package tema7;

import java.util.Scanner;

/**
 *
 * @author Ander De Abrisqueta Rangel
 */
public class Ejercicio14ArrayPalabras {

  /**
   * @param args the command line arguments
   */
  public static void main(String args[]) {
    Scanner s = new Scanner(System.in);

    String[] palabra = new String[8];
    String[] palabrasOrdenadas = new String[8];
    String[] colores = {"verde", "rojo", "azul", "amarillo", "naranja", "rosa", "negro",
      "blanco", "morado"};
    int j = 0;

    System.out.println("Por favor, introduzca 8 palabras (pulse enter para avanzar)");
    for (int i = 0; i < 8; i++) {
      System.out.print("Palabra " + "[" + i + "]: ");
      palabra[i] = s.nextLine().toLowerCase();

      for (String c: colores) {
        if (palabra[i].equals(c)) {
          palabrasOrdenadas[j++] = c;
        }
      }
    }

    for (int i = 0; i < 8; i++) {
      boolean esPalabraColor = false;

      for (String c : colores) {
        if (palabra[i].equals(c)) {
          esPalabraColor = true;
        }

      }

      if (!esPalabraColor) {
        palabrasOrdenadas[j++] = palabra[i];
      }
    }
    System.out.println("\n\nArray original:");
    System.out.println("\n┌────────┬────────┬────────┬────────┬────────┬────────┬────────┬────────┐");
    for (int i = 0; i < 8; i++) {
      System.out.printf("│   %d    ", i);
    }
    System.out.println("│\n├────────┼────────┼────────┼────────┼────────┼────────┼────────┼────────┤");

    for (String p : palabra) {
      System.out.printf("│%-8s", p);
    }
    System.out.println("│\n└────────┴────────┴────────┴────────┴────────┴────────┴────────┴────────┘");

    System.out.println("\n\nArray resultado:");
    System.out.println("\n┌────────┬────────┬────────┬────────┬────────┬────────┬────────┬────────┐");
    for (int i = 0; i < 8; i++) {
      System.out.printf("│   %d    ", i);
    }
    System.out.println("│\n├────────┼────────┼────────┼────────┼────────┼────────┼────────┼────────┤");

    for (String o : palabrasOrdenadas) {
      System.out.printf("│%-8s", o);
    }
    System.out.println("│\n└────────┴────────┴────────┴────────┴────────┴────────┴────────┴────────┘");
  }
}
