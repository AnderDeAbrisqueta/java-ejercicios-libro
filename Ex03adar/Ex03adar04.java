package ex03adar;

import java.util.Scanner;

/**
 * Examen Programación
 *
 * 16/12/2020
 *
 * DAM 1
 *
 * Ejercicio 4:
 *
 * @author Ander De Abrisqueta Rangel
 */
public class Ex03adar4 {

  /**
   * @param args the command line arguments
   */
  public static void main(String args[]) {
    Scanner s = new Scanner(System.in);

    System.out.print("Por favor, introduza un número largo entero positivo: ");
    long numeroIntroducido = Long.parseLong(s.nextLine());
         
    System.out.print("Las cifras pares del número " + numeroIntroducido + " son: ");
    
    long numero = numeroIntroducido;
    long numeroInverso = 0;
    int longitud = 0;
    
    while (numero > 0) {   
      numeroInverso = (numeroInverso * 10) + (numero % 10);
      numero /= 10;
      longitud++;
    } 
    
    int digito;
    
    for (int i = 0; i < longitud; i++) {
      digito = (int)(numeroInverso % 10);
      
      if (numeroInverso % 2 == 0) {
        System.out.print(digito);
      }
      
        numeroInverso /= 10;
    }
    System.out.println("");
    //Números Impares
    System.out.print("Las cifras impares del número " + numeroIntroducido + " son (en orden inverso): ");

    long numero1 = numeroIntroducido;
    long numeroInversoImpar = 0;
    
    while (numero1 > 0) {
      numeroInversoImpar = numero1 % 10;
      if (numeroInversoImpar % 2 != 0) {
        System.out.print(numeroInversoImpar);
      }
      numero1 /= 10;
    }
    System.out.println("");

  }
}
