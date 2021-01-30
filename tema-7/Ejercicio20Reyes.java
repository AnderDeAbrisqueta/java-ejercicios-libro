package tema7;

import java.util.Scanner;

/**
 *
 * @author Ander De Abrisqueta Rangel
 */
public class Ejercicio20Reyes {

  /**
   * @param args the command line arguments
   */
  public static void main(String args[]) {
    Scanner s = new Scanner(System.in);

    System.out.print("Introduzca el número total de nombres de reyes: ");
    int numeroReyes = Integer.parseInt(s.nextLine());
    System.out.println("");

    System.out.println("Vaya introduciendo los nombres de los reyes y pulsando INTRO.");
    String[] nombreReyes = new String[numeroReyes];

    for (int i = 0; i < numeroReyes; i++) {
      nombreReyes[i] = s.nextLine();
    }
    
    System.out.println("\nLos reyes introducidos son: \n");
    for (int i = 0; i < numeroReyes; i++) {
      int orden = 1;
      for (int j = 0; j < i; j++) {
        if (nombreReyes[i].equals(nombreReyes[j])) {
          orden++;
        }
      }
      System.out.println(nombreReyes[i] + " " + orden + "º");
    }

  }
}
