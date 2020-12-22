package tema5;

import java.util.Scanner;

/**
 *
 * @author Ander De Abrisqueta Rangel
 */
public class Ejercicio48DigitosQueAparecen {

  /**
   * @param args the command line arguments
   */
  public static void main(String args[]) {
    Scanner s = new Scanner(System.in);

    System.out.print("Por favor, introduzca un número entero positivo: ");
    long numeroIntroducido = Long.parseLong(s.nextLine());

    long numero;
    boolean aparecenNumeros;

    //Verifica los números presentes
    System.out.print("Dígitos que aparecen en el número: ");

    for (int i = 0; i < 10; i++) {
      aparecenNumeros = false;
      numero = numeroIntroducido;

      while (numero > 0) {
        if (numero % 10 == i) {
          aparecenNumeros = true;
        }
        numero /= 10;
      }
      if (aparecenNumeros) {
        System.out.print(i + " ");
      }

    }//Fin del for

    System.out.println("");
    //Verifica los números ausentes

    System.out.print("Dígitos que no aparecen: ");

    for (int i = 0; i < 10; i++) {
      aparecenNumeros = true;
      numero = numeroIntroducido;

      while (numero > 0) {
        if (numero % 10 == i) {
          aparecenNumeros = false;
        }
        numero /= 10;
      }
      if (aparecenNumeros) {
        System.out.print(i + " ");
      }

    }//Fin del for
    System.out.println("");
  }
}
