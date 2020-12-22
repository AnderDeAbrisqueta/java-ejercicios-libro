package tema6;

import java.util.Scanner;

/**
 *Escribe un programa que piense un número al azar entre 0 y 100. El usuario de-
 *be adivinarlo y tiene para ello 5 oportunidades. Después de cada intento fallido,
 *el programa dirá cuántas oportunidades quedan y si el número introducido es
 *menor o mayor que el número secreto.
 * 
 * @author Ander De Abrisqueta Rangel
 */
public class Ejercicio6NumeroSecreto {

  /**
   * @param args the command line arguments
   */
  public static void main(String args[]) {
    Scanner s = new Scanner(System.in);

    System.out.print("Programa para adivinar el número secreto entre 0 y 100\n");
    System.out.println("");
    
    int numeroSecreto = (int) (Math.random() * 101);
    int numeroIntroducido = 0;
    
    for (int i = 1; i < 6; i++) {
      System.out.print("Por favor, introduzca un número: ");
      numeroIntroducido = Integer.parseInt(s.nextLine());
      System.out.println("");
      
      if (numeroIntroducido == numeroSecreto) {
        i = 5;
        System.out.print("¡Enhorabuena! ");
        
      } else {
        if (numeroIntroducido < numeroSecreto) {
          System.out.println("El número introducido es menor que el número secreto.");
          System.out.println("Te quedan " + (5 - i) + " intentos.");
          System.out.println("Por favor, vuelva a intentarlo.");
          System.out.println("");
          
        }
        
        if (numeroIntroducido > numeroSecreto) {
          System.out.println("El número introducido es mayor que el número secreto.");
          System.out.println("Te quedan " + (5 - i) + " intentos.");
          System.out.println("Por favor, vuelva a intentarlo.");
          System.out.println("");
          
        } 
      }
      
    }
    
    System.out.println( numeroSecreto + " es el número secreto.");
    
  }
}
