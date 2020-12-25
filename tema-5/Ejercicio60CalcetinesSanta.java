package tema5;

import java.util.Scanner;

/**
 *
 * @author Ander De Abrisqueta Rangel
 */
public class Ejercicio60CalcetinesSanta {

  /**
   * @param args the command line arguments
   */
  public static void main(String args[]) {
    Scanner s = new Scanner(System.in);

    System.out.print("Por favor, introduzca la altura de los calcetines: ");
    int altura = Integer.parseInt(s.nextLine());
    System.out.println("");
    
    for (int i = 0; i < altura - 2; i++) {
      System.out.println("***     ***");
      
    }
    System.out.println("******  ******");
    System.out.println("******  ******");
  }
}
