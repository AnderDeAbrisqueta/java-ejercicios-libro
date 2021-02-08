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
public class Ejercicio54Ocurrencias {

  /**
   * @param args the command line arguments
   */
  public static void main(String args[]) {
    int[] a = {6, 66, 666};
//    System.out.println(ocurrencias(2, 123456));
    System.out.println(ocurrencias(6, a));
  }

  /**
   * Función devuelve el número de veces que aparece un dígito dentro de un
   * número.
   *
   * @param digito que está o no en el número.
   * @param n número donde se busca al dígito.
   * @return la ocurrencia del dígito en el número.
   */
  public static int ocurrencias(int digito, int n) {
    int contador = 0;
    for (int i = 0; i < misfunciones.Matematicas.digitos(n); i++) {
      if (misfunciones.Matematicas.digitoN(n, i) == digito) {
        contador++;
      }
    }
    return contador;
  }

  /**
   * Función devuelve el número de veces que aparece un dígito dentro de un
   * array.
   *
   * @param digito que está o no en el array.
   * @param a array.
   * @return la ocurrencia del dígito en el array.
   */
  public static int ocurrencias(int digito, int[] a) {
    int contador = 0;

    for (int j = 0; j < a.length; j++) {
      int numero = a[j];
      for (int i = 0; i < misfunciones.Matematicas.digitos(numero); i++) {
        if (misfunciones.Matematicas.digitoN(numero, i) == digito) {
          contador++;
        }
      }
    }
    return contador;
  }
}
