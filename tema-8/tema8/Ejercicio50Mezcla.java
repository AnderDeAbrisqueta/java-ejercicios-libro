/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema8;

/**
 *
 * @author Ander De Abrisqueta Rangel
 */
public class Ejercicio50Mezcla {

  /**
   * @param args the command line arguments
   */
  public static void main(String args[]) {
    int[] a = {};
    int[] b = {1, 2, 3};
    misfunciones.ArrayUnidimensional.pintaArrayConIndice(a);
    misfunciones.ArrayUnidimensional.pintaArrayConIndice(b);
    misfunciones.ArrayUnidimensional.pintaArrayConIndice(mezcla(a, b));
  }
  /**
   * Función que toma dos arrays como parámetros y devuelve un array que es
   * el resultado de mezclar los números de ambos de forma alterna.
   * 
   * @param a array 1.
   * @param b array 2.
   * @return array mezclado.
   */
  public static int[] mezcla(int[] a, int[] b) {
    int[] arrayResultado = new int[a.length + b.length];
    int i = 0;
    int j = 0;
    int k = 0;

    do {
      
      if (i < a.length) {
        arrayResultado[j++] = a[i++];
      }
      
      if (k < b.length) {
        arrayResultado[j++] = b[k++];
      }
      
    } while (j < a.length + b.length);

    return arrayResultado;
  }

}
