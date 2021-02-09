/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema8;

import java.util.Scanner;

/**
 *
 * @author Ander De Abrisqueta Rangel
 */
public class Ejercicio49LookAndSay {

  /**
   * @param args the command line arguments
   */
  public static void main(String args[]) {
    Scanner s = new Scanner(System.in);
    System.out.print("¿Cuántos términos de la sucesión look and say quiere calcular? ");
    int n = Integer.parseInt(s.nextLine());

    int[] a = {1};
    for (int i = 1; i <= n; i++) {
      System.out.print(misfunciones.ArrayUnidimensional.convierteArrayEnString(a));
      if (i < n) {
        System.out.print(", ");
      } else {
        System.out.println();
      }
      int[] resultado = {};
      while (a.length > 0) {
        int[] aux = new int[2];
        aux[0] = misfunciones.ArrayUnidimensional.repeticionesDelPrimero(a);
        aux[1] = a[0];
        a = misfunciones.ArrayUnidimensional.cola(a);
        resultado = misfunciones.ArrayUnidimensional.concatena(resultado, aux);
      }
      a = resultado.clone();
    }
  }
}
