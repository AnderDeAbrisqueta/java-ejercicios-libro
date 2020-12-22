/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema5;

import java.util.Scanner;

/**
 *
 * @AnderDeAbrisquetaRangel alumno
 */
public class Ejercicio20PiramideHueca {

  /**
   * @param args the command line arguments
   */
  public static void main(String args[]) {
    System.out.println("Programa que pinta una Pirámide\n");

    Scanner s = new Scanner(System.in);

    System.out.print("Por favor, introduza la altura (número de líneas): ");
    int altura = Integer.parseInt(s.nextLine());
    System.out.println("");

    System.out.print("Por favor, introduza el carácter que pintará la pirámide: ");
    String caracterPiramide = s.nextLine();
    System.out.println("");

    int filas = 1;
    int espaciosIniciales = altura - 1;
    int espaciosInternos = 0;
    int i = 0;

    while (filas < altura) {
      for (i = 1; i <= espaciosIniciales; i++) {
        System.out.print(' ');
      }
        System.out.print(caracterPiramide);
      
      for (i = 1; i < espaciosInternos; i++) {
        System.out.print(" ");
      }

      if (filas > 1) {
        System.out.print(caracterPiramide);
      }
      
        System.out.println("");
        
      filas++;
      espaciosIniciales--;
      espaciosInternos += 2;
      
    }
    
    for (i = 1; i < filas * 2; i++) {
        System.out.print(caracterPiramide);
    }
    
    System.out.println("");
  }
}
