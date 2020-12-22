
package tema6;

import java.util.Scanner;

/**
 *Realiza un programa que muestre al azar el nombre de una carta de la baraja
 *francesa. Esta baraja está dividida en cuatro palos: picas, corazones, diamantes
 *y tréboles. Cada palo está formado por 13 cartas, de las cuales 9 cartas son
 *numerales y 4 literales: 2, 3, 4, 5, 6, 7, 8, 9, 10, J, Q, K y A (que sería el
 *1).
 * 
 * @author Ander De Abrisqueta Rangel
 */
public class Ejercicio2NombreCartaFrancesa {

  /**
   * @param args the command line arguments
   */
  public static void main(String args[]) {
    Scanner s = new Scanner(System.in);
    
    System.out.print("Programa que muestra al azar el nombre de una carta");
    System.out.println("de la baraja Francesa \n");
      
    int cartaBarajaFrancesa = (int)(Math.random() * 13) + 1;
    
    switch (cartaBarajaFrancesa) {
      case 11:
        System.out.print("La carta es la J");
        break;
      
      case 12:
        System.out.print("La carta es la Q");
        break;  
      
      case 13:
        System.out.print("La carta es la K");
       break;  
       
      case 1:
        System.out.print("La carta es la A");
        break;   
        default:
          
          System.out.print("La carta es el " + cartaBarajaFrancesa);
    }
    
    int palo = (int) (Math.random() * 4) + 1;
    
    switch (palo) {
      case 1:
        System.out.println(" de Picas.");
        break;
        
      case 2:
        System.out.println(" de Corazones.");
        break;  
        
      case 3:
        System.out.println(" de Diamantes.");
        break;  
        
      case 4:
        System.out.println(" de Trebéoles.");
        break;
        default:
    }
    
  }
}
