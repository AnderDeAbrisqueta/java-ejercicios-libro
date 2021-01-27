package tema7;

import java.util.Scanner;

/**
 *
 * @author Ander De Abrisqueta Rangel
 */
public class Ejercicio13DestacarMaximoMinimo {

  /**
   * @param args the command line arguments
   */
  public static void main(String args[]) {
    Scanner s = new Scanner(System.in);

   
    int[] numerosAleatorios = new int[100];
    int i;
    int numeroMinimo = Integer.MAX_VALUE;
    int numeroMaximo = Integer.MIN_VALUE;

    for (i = 0; i < 100; i++) {
      numerosAleatorios[i] = (int) (Math.random() * 501);
      
      if (numerosAleatorios[i] < numeroMinimo) {
        numeroMinimo = numerosAleatorios[i];
      }

      if (numerosAleatorios[i] > numeroMaximo) {
        numeroMaximo = numerosAleatorios[i];
      }
    }
    
    //Array inicial
    System.out.println("Array inicial");
    for (int n : numerosAleatorios) {
      System.out.print(n + " ");
    }
    
    //Elección de la opción a realizar
    System.out.print("\n\n¿Qué quiere destacar? (1 – mínimo, 2 – máximo): ");
    int eleccion = Integer.parseInt(s.nextLine());
    
    System.out.println("");
    
    int numeroDestacado;
    
    if (eleccion == 1) {
      numeroDestacado = numeroMinimo;
    } else {
      numeroDestacado = numeroMaximo;
    }
    
    //Array destacando el valor seleccionado
    
    for (int n : numerosAleatorios) {
      if (n == numeroDestacado) {
       System.out.print(" **" + n + "** "); 
      } else {
        System.out.print(n + " ");
      }
      
    }
    System.out.println("");
  }
}
