/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema8;

import java.util.Scanner;
import misfunciones.Matematicas;

/**
 *
 * @author Ander De Abrisqueta Rangel
 */
public class Ejercicio35SistemaPalotes {

  /**
   * @param args the command line arguments
   */
  public static void main(String args[]) {
    Scanner s = new Scanner(System.in);
    System.out.print("Por favor, introduza el número que quiere convertir al sistema palotes: ");
    long n = Long.parseLong(s.nextLine());
    
    System.out.println(convierteEnPalotes(n));
  }

  public static String convierteEnPalotes(long n) {
    long longitud = Matematicas.digitos(n);
    String palotes = "";

    for (int i = 0; i < longitud; i++) {
      int digito = Matematicas.digitoN(n, i);
      for (int j = 0; j < 10; j++) {
        if (digito == j) {
          for (int k = 0; k < j; k++) {
            palotes += "|";
          }
        }
      }
      if (i < longitud - 1) {
        palotes = palotes + "-";
      }
    }
    return palotes;
  }
}
