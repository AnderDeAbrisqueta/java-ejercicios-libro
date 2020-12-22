/*
 *Realiza un programa que pinte una pirámide por pantalla. La altura se debe
 *pedir por teclado. El carácter con el que se pinta la pirámide también se debe
 *pedir por teclado.
 */
package tema5;

import java.util.Scanner;

/**
 *
 * @AnderDeAbrisqueta alumno
 */
public class Ejercicio19Piramide {

  /**
   * @param args the command line arguments
   */
  public static void main(String args[]) {
     System.out.println("Programa que pinta una Pirámide\n"); 
    
    Scanner s = new Scanner(System.in);
    
    System.out.print("Por favor, introduza la altura (número de líneas): ");
    int altura = Integer.parseInt(s.nextLine());
    System.out.println("");
    
    System.out.print("Por favor, introduza el caracter que pintará la pirámide: ");
    String caracterPiramide = s.nextLine();
    System.out.println("");
    
    int filas = 1;
    int longitudExtremos = 1;
    int espaciosIniciales = altura - 1;     

    while (filas <= altura) {

      // Izquierda
      for (int i = 0; i < espaciosIniciales; i++) {
        System.out.print(' ');
      }
      for (int i = 1; i <= longitudExtremos / 2; i++) {
        System.out.print(caracterPiramide);
      }

      // Centro
      if (filas % 2 == 1) {
        System.out.print(caracterPiramide);
        
      } else {
        System.out.print(caracterPiramide);
      }

      // Derecha
      for (int i = 1; i <= longitudExtremos / 2; i++) {
        System.out.print(caracterPiramide);
      }
      System.out.println();

      filas++;
      espaciosIniciales--;
      longitudExtremos += 2;
    }
  }
}
