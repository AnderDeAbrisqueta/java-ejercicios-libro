/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio09movil;

import java.text.DecimalFormat;

/**
 *
 * @author Ander De Abrisqueta Rangel
 */
public class Movil extends Terminal {

  private String tarifa;
  private double totalTarificados;

  public Movil(String numero, String tarifa) {
    super(numero);
    this.tarifa = tarifa;
    this.totalTarificados = 0;
  }

  @Override
  public String toString() {
    DecimalFormat formatoEuros = new DecimalFormat("0.00");
    return "Nº " + this.getNumeroTerminal() + " - " + this.getTiempoDeLlamada()
            + "s de conversación - tarificados "
            + formatoEuros.format(this.totalTarificados) + " euros";
  }
  
  /**
   * Método que sobrecarga al metodo llama de la Superclase Terminal, ya que se
   * calcula el total en euros por tarifa.
   * 
   * @param t terminal
   * @param tiempoDeLlamada tiempo transcurrido en la llamada entre dos terminales
   */
  @Override
  public void llama(Terminal t, int tiempoDeLlamada) {
    super.llama(t, tiempoDeLlamada);
    double minutos = (double) tiempoDeLlamada / 60;

    switch (this.tarifa) {
      case "rata":
        this.totalTarificados += minutos * 0.06;
        break;

      case "mono":
        this.totalTarificados += minutos * 0.12;
        break;

      case "bisonte":
        this.totalTarificados += minutos * 0.30;
        break;
      default:
    }

  }

}
