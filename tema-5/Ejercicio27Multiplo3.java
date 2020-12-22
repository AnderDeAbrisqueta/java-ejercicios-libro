package tema5;

import java.util.Scanner;

/**
 *Escribe un programa que muestre, cuente y sume los múltiplos de 3 que hay
 *entre 1 y un número leído por teclado.
* 
 * @author Ander De Abrisqueta Rangel
 */
public class Ejercicio27Multiplo3 {

  /**
   * @param args the command line arguments
   */
  public static void main(String args[]) {
    System.out.println("Programa que realiza diferentes cálculos con los multiplos de 3\n");

    Scanner s = new Scanner(System.in);
    
    System.out.print("Por favor, introduza un número entero: ");
    int numeroIntroducido = Integer.parseInt(s.nextLine());
    System.out.println("");
    
    int nTotal = 0; //Esta variable representa la cantidad de números introducidos
    int sumaNumeroMultiplo3 = 0;
    
    System.out.println("los número multiplos 3 entre el 1 y el número " + numeroIntroducido + " son: ");
    
    for (int i = 1; i <= numeroIntroducido; i++) {
      if (i % 3 == 0) {
        System.out.print(i + " \n");
        nTotal ++;
        sumaNumeroMultiplo3 += i;
      
      } 
    }
    
    System.out.println("El total de multiplos es de: " + nTotal);    
    System.out.println("La media de los número multiplos de 3 es: " + (double) sumaNumeroMultiplo3 / nTotal);
  }
}
