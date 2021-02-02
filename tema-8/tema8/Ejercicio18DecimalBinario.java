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
public class Ejercicio18DecimalBinario {
  /**
   * Función que convierte un número decimal a binario.
   * 
   * @param numeroDecimal número decimal que se quiere convertir en binario.
   * @return número binario.
   */
  public static String conversorDecimalBinario(long numeroDecimal) {
    String numeroBinario = "";

    do {
      numeroBinario = (numeroDecimal % 2 == 0 ? "0" : "1") + numeroBinario;

      numeroDecimal = (int) numeroDecimal / 2;

    } while (numeroDecimal >= 1);
    return numeroBinario;
  }
}
