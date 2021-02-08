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
public class Ejercicio55SinRepetir {

  /**
   * @param args the command line arguments
   */
  public static void main(String args[]) {
    String[] a = {"casa", "coche", "sol", "mesa", "mesa", "coche", "oro", "sol", "CASA"};
    misfunciones.ArrayUnidimensional.pintaArrayConIndice(a);
    misfunciones.ArrayUnidimensional.pintaArrayConIndice(sinRepetir(a));
  }
  /**
   * Función que elimina las repeticiones de un array (String).
   * 
   * @param s array al que se le quieren eliminar las repeticiones.
   * @return el array sin repeticiones.
   */
  public static String[] sinRepetir(String[] s) {
    String[] vacio = {};
    if (s.length == 0) {
      return vacio;
    }

    String aux[] = new String[s.length];
    int i = 0;

    for (String palabra : s) {
      if (!misfunciones.ArrayUnidimensional.estaEnArrayInt(aux, palabra)) {
        aux[i++] = palabra;
      }
    }

    String[] arrayResultado = new String[i];

    for (int j = 0; j < i; j++) {
      arrayResultado[j] = aux[j];
    }

    return arrayResultado;
  }
}
