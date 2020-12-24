package tema5;

import java.util.Scanner;

/**
 *
 * @author Ander De Abrisqueta Rangel
 */
public class Ejercicio55DesplazamientoDigitoDerecha {

  /**
   * @param args the command line arguments
   */
  public static void main(String args[]) {
    Scanner s = new Scanner(System.in);

    System.out.print("Por favor, introduzca un número entero positivo: ");
    long numeroIntroducido = Long.parseLong(s.nextLine());
    
    long numero = numeroIntroducido;
    int longitud = 0;
    
    //Longitud
    while (numero > 0) {
      numero /= 10;
      longitud++;
    }
    
    int digitoDesplazado = (int) numeroIntroducido % 10;
    
    long numeroCortado = (long) (numeroIntroducido / 10);
    
    long digitoDesplazadoInicio = (long) (digitoDesplazado * Math.pow(10, longitud - 1)) + numeroCortado;
    
    System.out.println("El número resultado es " + digitoDesplazadoInicio);
  }
}
