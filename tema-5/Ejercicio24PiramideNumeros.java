package tema5;

import java.util.Scanner;

/**
 *Escribe un programa que lea un número n e imprima una pirámide de números
 *con n filas
 * 
 * @author Ander De Abrisqueta Rangel
 */
public class Ejercicio24PiramideNumeros {

  /**
   * @param args the command line arguments
   */
  public static void main(String args[]) {
  System.out.println("Programa que pinta una Pirámide de números\n"); 
    
    Scanner s = new Scanner(System.in);
    
    System.out.print("Por favor, introduza un número (número de líneas): ");
    int altura = Integer.parseInt(s.nextLine());
    System.out.println("");
    
    int filas = 1;
    int longitudExtremos = 1;
    int espaciosIniciales = altura - 1;  
    

    while (filas <= altura) {

      // Izquierda
      for (int i = 0; i < espaciosIniciales; i++) {
        System.out.print(' ');
      }
        int caracter = 1;
      for (int i = 1; i <= longitudExtremos / 2; i++) {
        System.out.print(caracter);
        caracter++;
      }

      // Centro
      if (filas % 2 == 1) {
        System.out.print(caracter);
        
      } else {
        System.out.print(caracter);
      }

      // Derecha
      for (int i = filas-1; i > 0; i--) {
        System.out.print(i);
      }
      System.out.println();

      filas++;
      espaciosIniciales--;
      longitudExtremos += 2;
    }
  }
}
