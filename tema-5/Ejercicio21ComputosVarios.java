package tema5;

import java.util.Scanner;


/**
 *Realiza un programa que vaya pidiendo números hasta que se introduzca un
 *numero negativo y nos diga cuantos números se han introducido, la media de
 *los impares y el mayor de los pares. El número negativo sólo se utiliza para
 *indicar el final de la introducción de datos pero no se incluye en el cómputo.
 * 
 * @author Ander De Abrisqueta Rangel
 */
public class Ejercicio21ComputosVarios {

  /**
   * @param args the command line arguments
   */
  public static void main(String args[]) {
    System.out.println("Programa que realiza diferentes cálculos\n");

    Scanner s = new Scanner(System.in);
    
    System.out.println("Por favor, introduza números enteros: ");
    System.out.println("Para terminar introduzca un número negativo");
    
    int numero;
    int nImpares = 0; //Esta variable representa la cantidad de números impares
    int nTotal = 0; //Esta variable representa la cantidad de números introducidos
    int sumaImpares = 0;
    int numeroMaximoPar = 0;
    
    do {      
      
      numero = Integer.parseInt(s.nextLine());
      System.out.println("");
      
      if (numero >= 0) {
        nTotal ++;
        
       if (numero % 2 != 0) {
        sumaImpares += numero;
        nImpares++;
      
       } else {
          if (numero > numeroMaximoPar) {
            numeroMaximoPar = numero;
          
          }
          
        }
         
      }
      
              
    } while (numero >= 0);
    
    System.out.println("El total de numeros introducidos fue de: " + nTotal);    
    System.out.println("La media de los números impares es: " + (double) sumaImpares / nImpares);
    System.out.println("El mayor número par es: " + numeroMaximoPar);
  }
}
