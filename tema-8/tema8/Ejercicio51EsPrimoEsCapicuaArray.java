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
public class Ejercicio51EsPrimoEsCapicuaArray {

  /**
   * @param args the command line arguments
   */
  public static void main(String args[]) {
    int[] arrayOriginal = misfunciones.ArrayUnidimensional.generaArrayInt(2, 100, 10);
    System.out.println("Array generado:");
    misfunciones.ArrayUnidimensional.pintaArrayConIndice(arrayOriginal);

    for (int numero : arrayOriginal) {
      if (misfunciones.Matematicas.esPrimo(numero)) {
        if (misfunciones.Matematicas.esCapicua(numero)) {
          System.out.println("El " + numero + " es primo y es capicúa.");
        } else {
          System.out.println("El " + numero + " es primo y no es capicúa.");
        }
      }
      if (!misfunciones.Matematicas.esPrimo(numero)) {
        if (misfunciones.Matematicas.esCapicua(numero)) {
          System.out.println("El " + numero + " no es primo y es capicúa.");
        } else {
          System.out.println("El " + numero + " no es primo y ni es capicúa.");
        }
      }
    }
  }

}
