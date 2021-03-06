/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio11elcorteislandes;

import java.text.DecimalFormat;

/**
 *
 * @author Ander De Abrisqueta Rangel
 */
public class TarjetaRegalo {

  private double saldo;
  private int numeroDeTarjeta;

  public TarjetaRegalo(double saldo) {
    this.saldo = saldo;
    this.numeroDeTarjeta = (int) ((Math.random() * 99999 - 10000) + 10000);
  }

  public double getSaldo() {
    return saldo;
  }

  public void setSaldo(double saldo) {
    this.saldo = saldo;
  }

  @Override
  public String toString() {
    DecimalFormat formatoEuros = new DecimalFormat("0.00");
    return "Tarjeta nº " + numeroDeTarjeta + " - Saldo " + formatoEuros.format(saldo)
            + "€";
  }

  public void gasta(double compra) {
    if (compra > this.saldo) {
      System.out.printf("No tiene suficiente saldo para gastar %.2f€\n", compra);
    } else {
      saldo -= compra;
    }
  }
  
  public TarjetaRegalo fusionaCon(TarjetaRegalo tarjetaFusion) {
    double saldoTarjetaFusion = this.getSaldo() + tarjetaFusion.getSaldo();
    this.setSaldo(0);
    tarjetaFusion.setSaldo(0);
    return new TarjetaRegalo(saldoTarjetaFusion);
  }
}

