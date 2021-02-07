/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema8;

import misfunciones.ArrayUnidimensional;
import misfunciones.Matematicas;

/**
 * Esta función devuelve el número de dígitos de un numero entero
 *
 *
 * @author Ander De Abrisqueta Rangel
 */
public class Tema8 {

  /**
   * @param args the command line arguments
   */
  public static void main(String args[]) {
    int[] arrayOriginal = ArrayUnidimensional.generaArrayInt(0, 200, 20);
//    int[] arrayOriginal = {0, 3, 15, 25, 58, 10, 100, 78, 98, 23};
    ArrayUnidimensional.pintaArrayConIndice(arrayOriginal);
    ArrayUnidimensional.pintaArrayConIndice(ArrayUnidimensional.rotaIzquierdaArrayInt(arrayOriginal, 19));
//    ArrayUnidimensional.pintaArrayConIndice(ArrayUnidimensional.filtraPrimos(arrayOriginal));
//    System.out.println(ArrayUnidimensional.extraePrimos(arrayOriginal));
    
  }
}

 
