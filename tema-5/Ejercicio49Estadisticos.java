package tema5;

import java.util.Scanner;

/**
 *
 * @author Ander De Abrisqueta Rangel
 */
public class Ejercicio49Estadisticos {

  /**
   * @param args the command line arguments
   */
  public static void main(String args[]) {
    Scanner s = new Scanner(System.in);

    System.out.println("Por favor, introduza números enteros ");
    System.out.println("(para terminar introduzca un número primo): ");

    int numeroIntroducido;
    int contador = 0; //Esta variable representa la cantidad de números introducidos
    int sumaNumeros = 0;
    int numeroMaximo = 0;
    int numeroMinimo = 1000000;
    boolean numeroPrimo;

    do {
      numeroPrimo = true;
      numeroIntroducido = Integer.parseInt(s.nextLine());

      for (int i = 2; i < numeroIntroducido; i++) {

        double evaluacionNumero = numeroIntroducido % i;

        if (evaluacionNumero == 0) {
          numeroPrimo = false;

        }
      }

      if (numeroPrimo) {
        sumaNumeros -= numeroIntroducido;
        contador--;

      } else if (numeroIntroducido > numeroMaximo) {
        numeroMaximo = numeroIntroducido;
            
      } 
      
      if (numeroIntroducido < numeroMinimo) {
        numeroMinimo = numeroIntroducido;
      }

      sumaNumeros += numeroIntroducido;
      contador++;

    } while (!numeroPrimo);

    System.out.println("Ha introducido " + contador + " números no primos.");
    System.out.println("Máximo: " + numeroMaximo);
    System.out.println("Mínimo: " + numeroMinimo);
    double media = (double) sumaNumeros / contador;
    System.out.println("Media: " + media);
  }
}
