/*
 *Realiza un programa que pinte una pirámide maya. Por los lados, se trata
 *de una pirámide normal y corriente. Por el centro se van pintando líneas de
 *asteriscos de forma alterna (empezando por la superior): la primera se pinta,
 *la segunda no, la tercera sí, la cuarta no, etc. La terraza de la pirámide siempre
 *tiene 6 asteriscos, por tanto, las líneas centrales que se añaden a la pirámide
 *normal tienen 4 asteriscos. El programa pedirá la altura. Se supone que el
 *usuario introducirá un número entero mayor o igual a 3; no es necesario
 *comprobar los datos de entrada.
 */
package tema5;

import java.util.Scanner;

/**
 *
 * @AnderDeAbrisquetaRangel
 */
public class Ejercicio69PiramideMaya {

  /**
   * @param args the command line arguments
   */
  public static void main(String args[]) {
    System.out.println("Programa que pinta una Pirámide Maya\n"); 
    
    Scanner s = new Scanner(System.in);
    
    System.out.print("Por favor, introduza la altura (número de líneas): ");
    int altura = Integer.parseInt(s.nextLine());
    System.out.println("");
    
    int filas = 1;
    int longitudExtremos = 1;
    int espaciosIniciales = altura - 1;

    while (filas <= altura) {

      // Izquierda
      for (int i = 1; i <= espaciosIniciales; i++) {
        System.out.print(' ');
      }
      for (int i = 0; i <= longitudExtremos / 2; i++) {
        System.out.print('*');
      }

      // Centro
      if (filas % 2 == 1) {
        System.out.print("****");
        
      } else {
        System.out.print("    ");
      }

      // Derecha
      for (int i = 0; i <= longitudExtremos / 2; i++) {
        System.out.print('*');
      }
      System.out.println();

      filas++;
      espaciosIniciales--;
      longitudExtremos += 2;
    }
  }
}
