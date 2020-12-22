package tema5;

import java.util.Scanner;

/**
 *Escribe un programa que permita ir introduciendo una serie indeterminada
 *de números mientras su suma no supere el valor 10000. Cuando esto último
 *ocurra, se debe mostrar el total acumulado, el contador de los números
 *introducidos y la media.
 * @author Ander De Abrisqueta Rangel
 */
public class Ejercicio23CalculosVarios2 {

  /**
   * @param args the command line arguments
   */
  public static void main(String args[]) {
   System.out.println("Programa que realiza diferentes cálculos\n");

    Scanner s = new Scanner(System.in);
    
    System.out.print("Por favor, introduza números enteros: ");
    
    double numero;
    int nTotal = 0; //Esta variable representa la cantidad de números introducidos
    double sumaNumeros = 0;
    int salida = 0;
    
    do {      
      
      numero = Integer.parseInt(s.nextLine());
      System.out.println("");
      
      nTotal++;
      sumaNumeros += numero;
      salida = 1;
      
      if (sumaNumeros > 10000) {
        sumaNumeros -= numero;
        nTotal--;
        salida = 10000;
      }
      
    } while (salida < 10000);
    
    System.out.println("El total de numeros introducidos fue de: " + nTotal); 
    System.out.println("La suma total es de: " + sumaNumeros);
    System.out.println("La media es: " + (double) sumaNumeros / nTotal);
    
  }
}
