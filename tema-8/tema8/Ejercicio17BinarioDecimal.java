/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema8;

import misfunciones.Matematicas;

/**
 *
 * @author Ander De Abrisqueta Rangel
 */
public class Ejercicio17BinarioDecimal {
  /**
   * Función que convierte un número binario a decimal.
   * @param numeroBinario escrito en 0 y 1.
   * @return el número decimal.
   */
  public static long conversorBinarioDecimal(long numeroBinario) {
   long numeroVolteado = Matematicas.voltea(numeroBinario); 
   long numeroDecimal = 0;
    for (int i = 0; i < Matematicas.digitos(numeroVolteado); i++) {
      int digitoBinario = Matematicas.digitoN(numeroVolteado, i);
      numeroDecimal += digitoBinario * Matematicas.potencia(2, i);
    }
    return numeroDecimal;
  }
}
