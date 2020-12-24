package tema5;

import java.util.Scanner;

/**
 *
 * @author Ander De Abrisqueta Rangel
 */
public class Ejercicio58MediaDigitos {

  /**
   * @param args the command line arguments
   */
  public static void main(String args[]) {
    Scanner s = new Scanner(System.in);

    System.out.print("Por favor, introduza un número entero positivo: ");
    long numeroIntroducido = Long.parseLong(s.nextLine());

    long numero = numeroIntroducido;
    int digito = 0;
    int sumaDigitos = 0;
    int longitud = 0;

    while (numero > 0) {
      digito = (int) numero % 10;
      numero /= 10;
      sumaDigitos += digito;
      longitud++;
    }
    System.out.printf("La media de sus dígitos es %3.2f\n", (double) sumaDigitos / longitud);
    
  }
}
