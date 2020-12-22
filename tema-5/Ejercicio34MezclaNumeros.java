package tema5;

import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class Ejercicio34MezclaNumeros {

  /**
   * @param args the command line arguments
   */
  public static void main(String args[]) {
    Scanner s = new Scanner(System.in);
    
    long numeroIntroducido1;
    long numeroIntroducido2;
    long numero1;
    long numero2;
    long numeroInverso1 = 0;
    long numeroInverso2 = 0;
    int longitud1;
    int longitud2;
    
    do {  
      
      System.out.println("Los números que introduzca deben tener la misma longitud.\n");
      System.out.print("Por favor, introduza un número entero positivo: ");
      numeroIntroducido1 = Long.parseLong(s.nextLine());
    
      System.out.print("Por favor, introduza otro número entero positivo: ");
      numeroIntroducido2 = Long.parseLong(s.nextLine());
      
      numero1 = numeroIntroducido1;
      numero2 = numeroIntroducido2;
      longitud1 = 0;
      longitud2 = 0;
      
      while (numero1 > 0) {   
        numeroInverso1 = (numeroInverso1 * 10) + (numero1 % 10);
        numero1 /= 10;
        longitud1++; 
      }
      
      while (numero2 > 0) {   
        numeroInverso2 = (numeroInverso2 * 10) + (numero2 % 10);
        numero2 /= 10;
        longitud2++; 
      }
      
    } while (longitud1 != longitud2);
    
    System.out.println("");
    
    int digito;
    long numeroPar = 0;
    long numeroImpar = 0;

    
    for (int i = 0; i < longitud1; i++) {
      digito = (int)(numeroInverso1 % 10);
      
      if ((digito % 2) == 0) {
        numeroPar = numeroPar*10 + digito; 
      } else {
          numeroImpar = numeroImpar*10 + digito;
      }  
      
      digito = (int)(numeroInverso2 % 10);
      
      if ((digito % 2) == 0) {
        numeroPar = numeroPar*10 + digito;
      } else {
          numeroImpar = numeroImpar*10 + digito;
      }  
      
        numeroInverso1 /= 10;
        numeroInverso2 /= 10;
    }
    
    System.out.println("El número formado por los dígitos pares es: " + numeroPar);
    System.out.println("El número formado por los dígitos impares es: " + numeroImpar);
  }
}
