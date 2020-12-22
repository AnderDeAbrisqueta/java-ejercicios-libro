package tema5;

import java.util.Scanner;

/**
 *
 * @author Ander De Abrisqueta Rangel
 */
public class Ejercicio37ConversorPalotes {

  /**
   * @param args the command line arguments
   */
  public static void main(String args[]) {
    Scanner s = new Scanner(System.in);
    
    System.out.print("Por favor, introduzca un número entero positivo: ");
    long numeroIntroducido = Long.parseLong(s.nextLine());
    
    System.out.print("El " + numeroIntroducido + " convertido en palotes es: ");
    
    long numero = numeroIntroducido;
    long volteado = 0;
    
    while (numero > 0) {   
      volteado = (volteado * 10) + (numero % 10);
      numero /= 10;
    }
      
    do {      
      long digito = volteado % 10;
      volteado = volteado / 10;
      switch ((int)digito) {
        case 0: 
          System.out.print("  - ");
        break;
      
        case 1: 
          System.out.print("| - ");
        break;
      
        case 2: 
          System.out.print("|| - ");
        break;
        
        case 3: 
          System.out.print("||| - ");
        break;
        
        case 4: 
          System.out.print("|||| - ");
        break;
        
        case 5: 
          System.out.print("||||| - ");
        break;
        
        case 6: 
          System.out.print("|||||| - ");
        break;
        
        case 7: 
          System.out.print("||||||| - ");
        break;
        
        case 8: 
          System.out.print("|||||||| - ");
        break;
        
        case 9: 
          System.out.print("||||||||| - ");
        break;
        default:
      }
      
    } while (volteado > 0);
    System.out.println();
    
  }
}
