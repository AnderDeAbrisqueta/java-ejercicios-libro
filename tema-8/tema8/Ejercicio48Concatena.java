/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema8;

/**
 *
 * @author alumno
 */
public class Ejercicio48Concatena {

  /**
   * @param args the command line arguments
   */
  public static void main(String args[]) {
//    int[] arrayOriginal = misfunciones.ArrayUnidimensional.generaArrayInt(0, 200, 20);
    int[] a = {0, 3, 15, 25, 58, 10, 100, 78, 98, 23};
    int[] b = {1, 5, 7, 9};
    misfunciones.ArrayUnidimensional.pintaArrayConIndice(a);
    misfunciones.ArrayUnidimensional.pintaArrayConIndice(b);
    misfunciones.ArrayUnidimensional.pintaArrayConIndice(concatena(a, b));

  }

  /**
   * Función que concatena arrays.
   *
   * @param a primer array que se quiere concatenar.
   * @param b segundo array que se quiere concatenar.
   * @return array concatenado.
   */
  public static int[] concatena(int[] a, int[] b) {
    int[] arrayResultado = new int[a.length + b.length];
    int j = 0;

    for (int i = 0; i < a.length; i++) {
      arrayResultado[i] = a[i];
      j++;
    }

    for (int i = 0; i < b.length; i++) {
      arrayResultado[j++] = b[i];
    }
    return arrayResultado;
  }
}
