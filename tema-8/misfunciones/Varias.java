/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package misfunciones;

/**
 *
 * @author Ander De Abrisqueta Rangel
 */
public class Varias {

  public static boolean esCorrectoElDatoDeEntrada(int numeroIntroducido, int x) {
    boolean esCorrecto = true;

    if (numeroIntroducido >= x) {
      esCorrecto = true;
    } else {
      System.out.println("El número introducido no es correcto, debe ser mayor que " + x + ".");
      System.out.println("Por favor, vuelva a intentarlo."); 
      esCorrecto = false;
    }

    return esCorrecto;
  }

}
