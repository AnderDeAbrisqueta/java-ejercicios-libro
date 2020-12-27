/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema5;

import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class Ejercicio63PiramidesRellenas {

  /**
   * @param args the command line arguments
   */
  public static void main(String args[]) {
    System.out.println("Programa que pinta una Pirámide\n");

    Scanner s = new Scanner(System.in);

    System.out.print("Por favor, introduza la altura de la primera pirámide: ");
    int alturaPrimeraPiramide = Integer.parseInt(s.nextLine());
    System.out.println("");

    System.out.print("Por favor, introduzca la altura de la segunda pirámide: ");
    int alturaSegundaPiramide = Integer.parseInt(s.nextLine());
    System.out.println("");

    int alturaMaxima = Math.max(alturaPrimeraPiramide, alturaSegundaPiramide);
    int espaciosP1 = alturaPrimeraPiramide - 1;
    int espaciosP2 = alturaSegundaPiramide - 1;
    int baseP1 = alturaPrimeraPiramide * 2 - 1;
    int baseP2 = alturaSegundaPiramide * 2 - 1;
    int asteriscosP1 = 1;
    int asteriscosP2 = 1;

    for (int i = alturaMaxima; i > 0; i--) {

      // Pirámide 1
      
      if (i > alturaPrimeraPiramide) {
        // Si la pirámide 1 queda por debajo, pinta el hueco.
        for (int j = 0; j <= baseP1; j++) {
          System.out.print(" ");
        }
      } else {
        // Espacios por delante de la pirámide 1
        for (int j = 0; j < espaciosP1; j++) {
          System.out.print(" ");
        }

        // Pirámide 1
        for (int j = 0; j < asteriscosP1; j++) {
          System.out.print("*");
        }

        // Espacios por detrás de la pirámide 1
        for (int j = 0; j <= espaciosP1; j++) {
          System.out.print(" ");
        }

        espaciosP1--;
        asteriscosP1 += 2;
      }

      // Pirámide 2
      
      if (i > alturaSegundaPiramide) {
        // Si la pirámide 2 queda por debajo, pinta el hueco.
        for (int j = 0; j < baseP2; j++) {
          System.out.print(" ");
        }
      } else {
        // Espacios por delante de la pirámide 1
        for (int j = 0; j < espaciosP2; j++) {
          System.out.print(" ");
        }

        // Pirámide 1
        for (int j = 0; j < asteriscosP2; j++) {
          System.out.print("*");
        }

        // Espacios por detrás de la pirámide 1
        for (int j = 0; j <= espaciosP1; j++) {
          System.out.print(" ");
        }

        espaciosP2--;
        asteriscosP2 += 2;
      }
      System.out.println();
    }
  }
}
