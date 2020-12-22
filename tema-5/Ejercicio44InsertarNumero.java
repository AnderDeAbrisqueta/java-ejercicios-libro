package tema5;

import java.util.Scanner;

/**
 *
 * @author Ander De Abrisqueta Rangel
 */
public class Ejercicio44InsertarNumero {

  /**
   * @param args the command line arguments
   */
  public static void main(String args[]) {
    Scanner s = new Scanner(System.in);

    System.out.print("Por favor, introduzca un número entero positivo: ");
    long numeroIntroducido = Long.parseLong(s.nextLine());

    System.out.print("Introduzca la posición donde quiere insertar: ");
    int posicionPartir = Integer.parseInt(s.nextLine());
    
    System.out.print("Introduzca el dígito que quiere insertar: ");
    int numeroInsertar = Integer.parseInt(s.nextLine());

    long numero = numeroIntroducido;
    int longitud = 0;

    System.out.println("");

    //Longitud
    while (numero > 0) {
      numero /= 10;
      longitud++;
    }
    
    //Partido del número
    long numeroPartido1 = (long) (numeroIntroducido / Math.pow(10, longitud - posicionPartir + 1));
    long numeroPartido2 = (long) (numeroIntroducido % (Math.pow(10, longitud - posicionPartir + 1)));
    
    //Longitud del número a insertar
    int numero1 = numeroInsertar;
    int longitudNumeroInsertar = 0;
    
    while (numero1 > 0) {
      numero1 /= 10;
      longitudNumeroInsertar++;
    }
    
    long numeroInsertado = (long) (numeroPartido1 * Math.pow(10, longitudNumeroInsertar) + numeroInsertar);

    System.out.println("El número resultante es " + numeroInsertado + numeroPartido2);

  }
}
