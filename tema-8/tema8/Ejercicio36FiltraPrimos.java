/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema8;

import misfunciones.ArrayUnidimensional;

/**
 *
 * @author Ander De Abrisqueta Rangel
 */
public class Ejercicio36FiltraPrimos {

  /**
   * @param args the command line arguments
   */
  public static void main(String args[]) {
    System.out.println("Array original");
    int[] arrayOriginal = ArrayUnidimensional.generaArrayInt(0, 200, 20);
    ArrayUnidimensional.pintaArrayConIndice(arrayOriginal);
    System.out.println("Array Resultado");
    ArrayUnidimensional.pintaArrayConIndice(filtraPrimos(arrayOriginal));
  }

  /**
   * Función que filtra los números primos de un array.
   *
   * @param n array original.
   * @return array con los números primos extraidos del array original.
   */
  public static int[] filtraPrimos(int[] n) {
    int j = 0;
    for (int i : n) {
      if (misfunciones.Matematicas.esPrimo(i)) {
        j++;
      }
    }
    int[] arrayResultado = misfunciones.ArrayUnidimensional.extraePrimos(n);
    int[] arrayAuxiliar = {-1};
    return j == 0 ? arrayAuxiliar : arrayResultado;
  }
}
