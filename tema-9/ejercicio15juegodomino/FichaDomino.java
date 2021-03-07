/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio15juegodomino;

/**
 *
 * @author Ander De Abrisqueta Rangel
 */
public class FichaDomino {

  private int ladoIzquierdoFicha;
  private int ladoDerechoFicha;

  public FichaDomino() {
  }

  public FichaDomino(int ladoIzquierdoFicha, int ladoDerechoFicha) {
    this.ladoIzquierdoFicha = ladoIzquierdoFicha;
    this.ladoDerechoFicha = ladoDerechoFicha;
  }

  @Override
  public String toString() {
    
    return "[" + (ladoIzquierdoFicha == 0 ? " " : ladoIzquierdoFicha) 
            + "|" + (ladoDerechoFicha == 0 ? " " :  ladoDerechoFicha) + "]";
  }
  
  /**
   * Método que voltea la ficha de dominó.
   * 
   * @return la ficha volteada.
   */
  public FichaDomino voltea() {
    return new FichaDomino (ladoDerechoFicha, ladoIzquierdoFicha);
  }
  
  /**
   * Método que verifica si dos lados encajan.
   * 
   * @param ficha
   * @return verdadero o falso
   */
  public boolean encaja(FichaDomino ficha) {
    return (ladoIzquierdoFicha == ficha.ladoIzquierdoFicha) ||
            (ladoIzquierdoFicha == ficha.ladoDerechoFicha) ||
            (ladoDerechoFicha == ficha.ladoIzquierdoFicha) ||
            (ladoDerechoFicha == ficha.ladoDerechoFicha);
  } 
  
  /**
   * Método que verifica si las fichas encajan.
   * 
   * @param ficha
   * @return verdadero o falso
   */
  public boolean encajaFicha(FichaDomino ficha) {
    return ladoDerechoFicha == ficha.ladoIzquierdoFicha;
  }
}
