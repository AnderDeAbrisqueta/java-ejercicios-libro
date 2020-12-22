/*
 *Escribe un programa que dados dos números, uno real (base) y un entero
 *positivo (exponente), saque por pantalla todas las potencias con base el
 *numero dado y exponentes entre uno y el exponente introducido. No se deben
 *utilizar funciones de exponenciación. Por ejemplo, si introducimos el 2 y el 5,
 *se deberán mostrar 2¹ , 2² , 2³ , 2⁴ y 2⁵.
 */
package tema5;

import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class Ejercicio15PotenciaPantalla {

  /**
   * @param args the command line arguments
   */
  public static void main(String args[]) {
    System.out.println("Programa que calcula la potencia de un número\n"); 
    
    Scanner s = new Scanner(System.in);
    
    System.out.print("Por favor, introduza la base: ");
    int base = Integer.parseInt(s.nextLine());
    System.out.print("");
    
    System.out.print("Por favor, introduza el exponente: ");
    int exponente = Integer.parseInt(s.nextLine());
    System.out.print("");
    
     double potencia = 1;
     int exponentePintado;
        
     for (int i = 1; i <= exponente; i++) {
        
      potencia = 1;
      exponentePintado = i;
      
      for (int j = 0; j < exponentePintado; j++) {
        potencia *= base;
      }
      
      System.out.println(base + "E" + i + " = " + potencia);
    }
  }
}
