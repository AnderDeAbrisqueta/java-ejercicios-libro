package tema6;

import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class Ejercicio13TiradaDados {

  /**
   * @param args the command line arguments
   */
  public static void main(String args[]) {
    Scanner s = new Scanner(System.in);
    
    System.out.println("Programa que muestra la tirada de dos dados \n");
    
    int tiradaDados1 = 0;
    int tiradaDados2 = 0;
    boolean pararTiradas = false;
    
    do {      
      pararTiradas = false;
      tiradaDados1 = ((int)(Math.random() * 6) + 1);
      tiradaDados2 = ((int)(Math.random() * 6) + 1);
      
      System.out.print("Dado 1: " + tiradaDados1);
      System.out.println(" y Dado 2: " + tiradaDados2);
      
      if (tiradaDados1 == tiradaDados2) {
        pararTiradas = true;
        
      }
      
    } while (!pararTiradas);

  }
}
