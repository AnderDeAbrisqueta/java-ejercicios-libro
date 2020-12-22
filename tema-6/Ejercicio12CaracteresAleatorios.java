package tema6;

import java.util.Scanner;

/**
 *Realiza un programa que llene la pantalla de caracteres aleatorios (a lo Matrix)
 *con el código ascii entre el 32 y el 126. Puedes hacer casting con (char) para
 *convertir un entero en un carácter.
 * 
 * @author Ander De Abrisqueta Rangel
 */
public class Ejercicio12CaracteresAleatorios {

  /**
   * @param args the command line arguments
   */
  public static void main(String args[]) {
    Scanner s = new Scanner(System.in);
    
    int linea = 0;
    
    System.out.print("\033[32m");
    
    for (int i = 0; i < 10000; i++) {
      System.out.print("\033[32m");
      System.out.print((char)(Math.random() * (126 - 32 + 1) + 32));
      
      if (linea++ == 100) {
        linea = 0;
        System.out.println("");
        
      }
      
    }
  }
}
