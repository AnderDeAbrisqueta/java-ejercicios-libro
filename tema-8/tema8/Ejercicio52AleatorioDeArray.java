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
public class Ejercicio52AleatorioDeArray {

  /**
   * @param args the command line arguments
   */
  public static void main(String args[]) {
//    int[] arrayOriginal = misfunciones.ArrayUnidimensional.generaArrayInt(0, 200, 5);
    int[] arrayOriginal = {0, 3, 15, 25, 58, 10, 100, 78, 98, 23};
    misfunciones.ArrayUnidimensional.pintaArrayConIndice(arrayOriginal);
    System.out.println(aleatorioDeArray(arrayOriginal));
  }

  /**
   * Función que devuelve un número del array de forma aleatoria.
   *
   * @param a array de donde se quiere escoger el número de forma aleatoria.
   * @return un númenro del array escogido aleatoriamente.
   */
  public static int aleatorioDeArray(int[] a) {
    int numeroEscogidoAzar = 0;
    int indice = (int) (Math.random() * a.length);
    for (int i = 0; i < a.length; i++) {
      if (i == indice) {
        numeroEscogidoAzar = a[i];
      }
    }
    return numeroEscogidoAzar;
  }
}
