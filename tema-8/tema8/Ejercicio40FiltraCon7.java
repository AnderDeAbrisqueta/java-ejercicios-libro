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
public class Ejercicio40FiltraCon7 {

  /**
   * @param args the command line arguments
   */
  public static void main(String args[]) {
    System.out.println("Array original");
    int[] arrayOriginal = ArrayUnidimensional.generaArrayInt(0, 200, 20);
    ArrayUnidimensional.pintaArrayConIndice(arrayOriginal);
    System.out.println("Array Resultado");
    ArrayUnidimensional.pintaArrayConIndice(filtraCon7(arrayOriginal));
  }

  public static int[] filtraCon7(int[] n) {
    int[] arrayAuxiliar = new int[n.length];
    int j = 0;
    for (int i = 0; i < n.length; i++) {
      int k = misfunciones.Matematicas.digitos(n[i]);
      for (int l = 0; l < k; l++) {
        if (misfunciones.Matematicas.digitoN(n[i], l) == 7) {
          arrayAuxiliar[j++] = n[i];
        }
      }
    }
    int[] arrayResultado = new int[j];
    int[] arrayAuxiliar2 = {-1};
    for (int i = 0; i < j; i++) {
      arrayResultado[i] = arrayAuxiliar[i];
    }
    return j == 0 ? arrayAuxiliar2 : arrayResultado;
  }
}
