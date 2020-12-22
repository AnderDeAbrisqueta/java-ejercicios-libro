package tema5;

import java.util.Scanner;

/**
 *Realiza un programa que pinte la letra L por pantalla hecha con asteriscos. El
 *programa pedirá la altura. El palo horizontal de la L tendrá una longitud de la
 *mitad (división entera entre 2) de la altura más uno.
 * 
 * @author Ander De Abrisqueta Rangel
 */
public class Ejercicio31L {

  /**
   * @param args the command line arguments
   */
  public static void main(String args[]) {
    Scanner s = new Scanner(System.in);
     
    System.out.print("Por favor introduzca la altura: ");
    int altura = Integer.parseInt(s.nextLine());
    System.out.println();
    
    for (int i = 1; i < altura; i++) {
        System.out.println("*");
      
    }
    
    for (int i = 0; i < (altura / 2 + 1); i++) {
        
        System.out.print("* ");
      
    }
        System.out.println();
  }
}
