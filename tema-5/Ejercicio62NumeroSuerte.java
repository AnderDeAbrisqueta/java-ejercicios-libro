package tema5;

import java.util.Scanner;

/**
 *
 * @author Ander De Abrisqueta Rangel
 */
public class Ejercicio62NumeroSuerte {

  /**
   * @param args the command line arguments
   */
  public static void main(String args[]) {
    Scanner s = new Scanner(System.in);

    System.out.print("Por favor, introduzca un número: ");
    long numeroIntroducido = Long.parseLong(s.nextLine());
    
    long numero = numeroIntroducido;
    int contadorNumeroSuerte = 0;
    int contadorNumeroMalaSuerte = 0;
    int digito = 0;
    
    while (numero > 0) {
      digito = (int) numero % 10;
      
      if (digito == 3 || digito == 7 || digito == 8 || digito == 9) {
        contadorNumeroSuerte++;
        
      } else {
        contadorNumeroMalaSuerte++;
      }
      numero /= 10;
    }
    
    if (contadorNumeroSuerte > contadorNumeroMalaSuerte) {
      System.out.println("El " + numeroIntroducido + " es un número afortunado.");
      
    } else {
      System.out.println("El " + numeroIntroducido + " no es un número afortunado.");
    }
    
  }
}
