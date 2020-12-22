/*
 *Escribe un programa que obtenga los números enteros comprendidos entre dos
 *números introducidos por teclado y validados como distintos, el programa debe
 *empezar por el menor de los enteros introducidos e ir incrementando de 7 en 7.
 */
package tema5;

import java.util.Scanner;

/**
 *
 * @AnderDeAbrisquetaRangel alumno
 */
public class Ejercicio18NumerosEntreNumeros {

  /**
   * @param args the command line arguments
   */
  public static void main(String args[]) {
    System.out.println("Programa que busca los números entre dos números enteros\n"); 
    
    Scanner s = new Scanner(System.in);
    
    int primerNumero;
    int segundoNumero;
    
    do {    
      
      System.out.print("Por favor, introduza el primer número entero: ");
      primerNumero = Integer.parseInt(s.nextLine());
      System.out.println("");
    
      System.out.print("Por favor, introduza el segundo número entero: ");
      segundoNumero = Integer.parseInt(s.nextLine());
      System.out.println("");
    
      if (primerNumero == segundoNumero) {
      System.out.println("Los números son iguales");
      }
    } while (primerNumero == segundoNumero);
    
    
    if (primerNumero > segundoNumero) {
     System.out.println("Los números son:");
     for (int i = segundoNumero; i < primerNumero; i += 7) {
          
       System.out.print(i + " ");
     }
     System.out.println(primerNumero);
         
    } else {
        System.out.println("Los números son:");
        for (int i = primerNumero; i < segundoNumero; i += 7) {
            
          System.out.print(i + " ");
        }
        System.out.println(segundoNumero);
    }
      
  }
}
