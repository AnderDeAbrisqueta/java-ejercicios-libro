package tema7;

import java.util.Scanner;

/**
 *
 * @author Ander De Abrisqueta Rangel
 */
public class Ejercicio07BuscarSustituir {

  /**
   * @param args the command line arguments
   */
  public static void main(String args[]) {
    Scanner s = new Scanner(System.in);

    int numero[] = new int[100];

    //Generación de los números aleatorios
    for (int i = 0; i < 100; i++) {
      numero[i] = (int) (Math.random() * 21);
      System.out.print(numero[i] + " ");
    }
    System.out.println("");
    
    System.out.print("Por favor, introduzca el valor que desea cambiar: ");
    int numeroCambiar = Integer.parseInt(s.nextLine());
    
    System.out.print("El número que desea introducir es: ");
    int numeroIntroducir = Integer.parseInt(s.nextLine());
    
    System.out.println("");
    
    String rojo = "\033[31m";
    String negro = "\033[30m";
    
    for (int i = 0; i < 100; i++) {
      if (numero[i] == numeroCambiar) {
        numero[i] = numeroIntroducir;
        System.out.print(rojo + "\"" + numero[i] + "\" ");
      } else {
          System.out.print(negro + numero[i] + " ");
      }
        
    }
    System.out.println("");
  }
}
