package tema5;

import java.util.Scanner;

/**
 *Escribe un programa que, dado un número entero positivo, diga cuáles son y
 *cuánto suman los dígitos pares. Los dígitos pares se deben mostrar en orden, de
 *izquierda a derecha. Usa long en lugar de int donde sea necesario para admitir
 *números largos.
 * 
 * @author Ander De Abrisqueta Rangel
 */
public class Ejercicio32ComputosVariosPares {

  /**
   * @param args the command line arguments
   */
  public static void main(String args[]) {
    Scanner s = new Scanner(System.in);
    
    System.out.print("Por favor, introduza un número entero positivo: ");
    long numeroIntroducido = Long.parseLong(s.nextLine());
    
    long numero = numeroIntroducido;
    long numeroInverso = 0;
    int longitud = 0;
    
    while (numero > 0) {   
      numeroInverso = (numeroInverso * 10) + (numero % 10);
      numero /= 10;
      longitud++;
    } 
    
    System.out.print("Dígitos pares: ");
    
    int digito;
    int sumaNumerosPares = 0;
    
    for (int i = 0; i < longitud; i++) {
      digito = (int)(numeroInverso % 10);
      
      if (numeroInverso % 2 == 0) {
        System.out.print(digito + " ");
        sumaNumerosPares += digito;
      }
      
        numeroInverso /= 10;
    }
    
     System.out.println("\nSuma de los dígitos pares: " + sumaNumerosPares);
  }
}
