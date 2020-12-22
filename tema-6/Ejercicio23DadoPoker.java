package tema6;

import java.util.Scanner;

/**
 *Las caras de un dado de poker tienen las siguientes figuras: As, K, Q, J, 7 y 8.
 *Escribe un programa que genere de forma aleatoria la tirada de cinco dados.
 * 
 * @author Ander De Abrisqueta Rangel
 * 
 */
public class Ejercicio23DadoPoker {

  /**
   * @param args the command line arguments
   */
  public static void main(String args[]) {
    Scanner s = new Scanner(System.in);
    
    String tiradaDadoPoker = "";
    
    System.out.println("Tirada de dados de poker:");
    
    for (int i = 1; i < 6; i++) {
      int carasDadoPoker = (int)(Math.random() * 6);
      
      switch (carasDadoPoker) {
        case 0:
          tiradaDadoPoker = "As";
          break;
          
        case 1:
          tiradaDadoPoker = "K";
          break;
          
        case 2:
          tiradaDadoPoker = "Q";
          break;
            
        case 3:
          tiradaDadoPoker = "J";
          break;
              
        case 4:
          tiradaDadoPoker = "7";
          break;
            
        case 5:
          tiradaDadoPoker = "8";
          break;
        default:
      } // Fin del switch
      System.out.println("Dado " + i + ": " + tiradaDadoPoker);
    } // Fin del for
  }
}
