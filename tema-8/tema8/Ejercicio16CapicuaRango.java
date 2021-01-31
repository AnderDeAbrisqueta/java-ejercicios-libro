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
public class Ejercicio16CapicuaRango {

  /**
   * Función que muestra los números capicúa que hay en un rango.
   *
   * @param x número inferior del rango.
   * @param y número superior del rango.
   */
  public static void numerosCapicuas(int x, int y) {
    for (int i = x; i < y; i++) {
      if (Matematicas.esCapicua(i)) {
        System.out.print(i + " ");
      }
    }
  }

}
