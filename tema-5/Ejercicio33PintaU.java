package tema5;

import java.util.Scanner;


/**
 *Realiza un programa que pinte la letra U por pantalla hecha con asteriscos. El
 *programa pedirá la altura. Fíjate que el programa inserta un espacio y pinta
 *dos asteriscos menos en la base para simular la curvatura de las esquinas
 *inferiores.
 * 
 * @author Ander De Abrisqueta Rangel
 */
public class Ejercicio33PintaU {

  /**
   * @param args the command line arguments
   */
  public static void main(String args[]) {
    Scanner s = new Scanner(System.in);
     
    System.out.print("Por favor introduzca la altura: ");
    int altura = Integer.parseInt(s.nextLine());
    System.out.println();
    
      // Lado izquierdo
    for (int i = 1; i < altura; i++) {
        System.out.print("* ");
       //Espacios internos
      for (int j = 2; j < altura; j++) {
        System.out.print("  ");
      
      }
      
      // Lado derecho
        System.out.println("*");
    } 
      
    // Base de la U
       System.out.print("  ");
    for (int i = 2; i < altura; i++) {
       System.out.print("* ");
    } 
       System.out.println();
  }
}
