package tema6;

import java.util.Scanner;

/**
 *Igual que el ejercicio anterior pero con la baraja española. Se utilizará la baraja
 *de 40 cartas: 2, 3, 4, 5, 6, 7, sota, caballo, rey y as.
 * 
 * @author Ander De Abrisqueta Rangel
 */
public class Ejercicio3NombreCartaEspañola {

  /**
   * @param args the command line arguments
   */
  public static void main(String args[]) {
    Scanner s = new Scanner(System.in);
    
    System.out.print("Programa que muestra al azar el nombre de una carta");
    System.out.println("de la baraja Española \n");
      
    int cartaBarajaSpain = (int)(Math.random() * 10) + 1;
    
    switch (cartaBarajaSpain) {
      case 8:
        System.out.print("La carta es la Sota");
        break;
      
      case 9:
        System.out.print("La carta es el Caballo");
        break;  
      
      case 10:
        System.out.print("La carta es el Rey");
       break;  
       
      case 1:
        System.out.print("La carta es el As");
        break;   
        default:
          
          System.out.print("La carta es el " + cartaBarajaSpain);
    }
    
    int palo = (int) (Math.random() * 4) + 1;
    
    switch (palo) {
      case 1:
        System.out.println(" de Oro.");
        break;
        
      case 2:
        System.out.println(" de Copas.");
        break;  
        
      case 3:
        System.out.println(" de Espadas.");
        break;  
        
      case 4:
        System.out.println(" de Bastos.");
        break;
        default:
    }
  }
}
