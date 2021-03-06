/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio08terminal;

/**
 *
 * @author Ander De Abrisqueta Rangel
 */
public class Terminal {

  private String numeroTerminal;
  private int tiempoDeLlamada; //en segundos

  public Terminal(String numero) {
    this.numeroTerminal = numero;
    this.tiempoDeLlamada = 0;
  }

  public String getNumeroTerminal() {
    return numeroTerminal;
  }

  public int getTiempoDeLlamada() {
    return tiempoDeLlamada;
  }

  public void setNumeroTerminal(String numeroTerminal) {
    this.numeroTerminal = numeroTerminal;
  }

  public void setTiempoDeLlamada(int tiempoDeLlamada) {
    this.tiempoDeLlamada = tiempoDeLlamada;
  }

  @Override
  public String toString() {
    return "Nº " + numeroTerminal + " - " + tiempoDeLlamada + "s de conversación";
  }

  
  
  public void llama( Terminal t, int tiempoDeLlamada) {
    this.tiempoDeLlamada += tiempoDeLlamada;
    t.tiempoDeLlamada += tiempoDeLlamada;
  }

}
