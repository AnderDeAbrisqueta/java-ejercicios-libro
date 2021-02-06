/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema8;

import misfunciones.ArrayUnidimensional;
import misfunciones.Matematicas;
import static tema8.Ejercicio36FiltraPrimos.filtraPrimos;

/**
 *
 * @author Ander De Abrisqueta Rangel
 */
public class Ejercicio38FiltraCapicuas {

  /**
   * @param args the command line arguments
   */
  public static void main(String args[]) {
    System.out.println("Array original");
    int[] arrayOriginal = ArrayUnidimensional.generaArrayInt(0, 200, 5);
    ArrayUnidimensional.pintaArrayConIndice(arrayOriginal);
    System.out.println("Array Resultado");
    ArrayUnidimensional.pintaArrayConIndice(filtraCapicuas(arrayOriginal));
  }

  /**
   * Función que extrae los número capicúas de un array.
   *
   * @param n número del elemento del array.
   * @return un array con los número capicúas.
   */
  public static int[] extraeCapicuas(int[] n) {
    int[] arrayAuxiliar = new int[n.length];
    int j = 0;
    for (int i = 0; i < n.length - 1; i++) {
      if (Matematicas.esCapicua(n[i])) {
        arrayAuxiliar[j++] = n[i];
      }
    }
    int[] arrayResultado = new int[j];
    for (int i = 0; i < j; i++) {
      arrayResultado[i] = arrayAuxiliar[i];
    }
    return arrayResultado;
  }

  /**
   * Función que filtra los números capicúas de un array.
   *
   * @param n array original de donde se quieren filtrar los números capicúas.
   * @return un array con los números capicúas.
   */
  public static int[] filtraCapicuas(int[] n) {
    int j = 0;
    for (int i : n) {
      if (misfunciones.Matematicas.esCapicua(i)) {
        j++;
      }
    }
    int[] arrayResultado = extraeCapicuas(n);
    int[] arrayAuxiliar = {-1};
    return j == 0 ? arrayAuxiliar : arrayResultado;
  }
}
