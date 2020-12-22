package tema5;

import java.util.Scanner;

/**
 *Muestra por pantalla todos los números primos entre 2 y 100, ambos incluidos.
 * 
 * @author Ander De Abrisqueta Rangel
 */
public class Ejercicio22NumerosPrimos {

  /**
   * @param args the command line arguments
   */
  public static void main(String args[]) {
    System.out.println("Programa que muestra los números primos entre el 2 y el 100\n");

    Scanner s = new Scanner(System.in);
    
    //boolean numeroPrimo = true;
    
    for (int numeros = 2; numeros <= 100; numeros++) {
      boolean numeroPrimo = true;
      for (int j = 2; j < numeros; j++) {

        double evaluacionNumero = numeros%j;
      
        if (evaluacionNumero == 0) {
          numeroPrimo = false;
          
        }  
      }
      
      if (numeroPrimo) {
       System.out.println(numeros); 
        
      }
    }
    
  }
}
