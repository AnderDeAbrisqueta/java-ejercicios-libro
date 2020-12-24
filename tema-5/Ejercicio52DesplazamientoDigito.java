package tema5;

import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class Ejercicio52DesplazamientoDigito {

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
    
    long numeroCortado = (long) (numeroIntroducido % Math.pow(10, longitud - 1));
    
    int digitoDesplazado = (int) (numeroIntroducido / Math.pow(10, longitud - 1));
    
    long numeroDigitosDesplazados = numeroCortado * 10 + digitoDesplazado;
    System.out.println("El número resultado es " + numeroDigitosDesplazados);
    
  }
}
