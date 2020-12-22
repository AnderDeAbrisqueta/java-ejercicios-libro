package tema5;

import java.util.Scanner;

/**
 *
 * @author Ander De Abrisqueta Rangel
 */
public class Ejercicio47Numero8 {

  /**
   * @param args the command line arguments
   */
  public static void main(String args[]) {
    Scanner s = new Scanner(System.in);

    int altura = 0;

    boolean esUnaAlturaCorrecta = false;

    //Comprobación de la entrada de datos
    do {
      System.out.print("Por favor, introduzca la altura (número impar mayor o igual a 5): ");
      altura = Integer.parseInt(s.nextLine());

      if ((altura % 2 != 0) && (altura >= 5)) {
        esUnaAlturaCorrecta = true;

      } else {
        System.out.println("La altura introducida no es correcta \n");
      }

    } while (!esUnaAlturaCorrecta);

    int espaciosBlancos = 0;

    System.out.println("MMMMMM");
    
    for (int i = 1; i < altura / 2; i++) {
      System.out.print("M");
      for (int j = 0; j < 4; j++) {
        System.out.print(" ");
        
      }
      System.out.print("M");
      System.out.println("");
      
    }
    
    System.out.println("MMMMMM");
    
    for (int i = 1; i < altura / 2; i++) {
      System.out.print("M");
      for (int j = 0; j < 4; j++) {
        System.out.print(" ");
        
      }
      System.out.print("M");
      System.out.println("");
      
    }
    
    System.out.println("MMMMMM");
    System.out.println("");
    
  }
}
