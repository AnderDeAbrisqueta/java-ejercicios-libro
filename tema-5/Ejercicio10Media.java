/*
 * Escribe un programa que calcule la media de un conjunto de números positivos
 *introducidos por teclado. A priori, el programa no sabe cuántos números se
 *introducirán. El usuario indicará que ha terminado de introducir los datos
 *cuando meta un número negativo.
 */
package ejercicio10media;

import java.util.Scanner;

/**
 *
 * @Ander De Abrisqueta Rangel
 */
public class Ejercicio10Media {

  /**
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    System.out.println("Programa para el cálculo de la media");
    System.out.println("Para salir introducir un número negativo");
    
    Scanner s = new Scanner(System.in);
    double suma = 0;
    double numero = 0;
    int numeroCantidad = 0;
    
    while (numero >= 0) {      
      System.out.print("Por favor, introduzca un número: ");
      numero = Double.parseDouble(s.nextLine());
      System.out.print("");
      numeroCantidad++;
      suma += numero;
    }
    
    double media = (suma-numero) / (numeroCantidad-1);
        
     System.out.printf("La media es: %.2f\n", media);
  }
  
}
