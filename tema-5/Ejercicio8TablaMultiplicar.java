/*
 * Muestra la tabla de multiplicar de un número introducido por teclado.
 */
package ejercicio8tablamultiplicar;

import java.util.Scanner;

/**
 *
 * @Ander De Abrisqueta Rangel
 */
public class Ejercicio8TablaMultiplicar {

  /**
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    System.out.println("Programa tabla de multiplcar");
    
    Scanner s = new Scanner(System.in);
    System.out.print("Por favor, introduzca el número del que desea saber su tabla: ");
    int numero = Integer.parseInt(s.nextLine());
    
    for (int i = 0; i <= 10; i++) {
      int multiplicacion = numero * i;
      System.out.printf("%2d *%2d = %3d\n", numero, i, multiplicacion);
    }
  }
  
}
