/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio13cuentacorriente;

import java.text.DecimalFormat;

/**
 *
 * @author Ander De Abrisqueta Rangel
 */
public class CuentaCorriente {

  private String numeroDeCuenta;
  private double saldo;

  public CuentaCorriente() {
    this.numeroDeCuenta = "";
    this.saldo = 0;
    for (int i = 0; i < 10; i++) {
      this.numeroDeCuenta += (int) (Math.random() * 10);
    }
  }

  public CuentaCorriente(double saldo) {
    this.saldo = saldo;
    this.numeroDeCuenta = "";
    for (int i = 0; i < 10; i++) {
      this.numeroDeCuenta += (int) (Math.random() * 10);
    }
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
    return "Número de cta: " + numeroDeCuenta + " Saldo: "
            + formatoEuros.format(saldo) + " €";
  }
  
  /**
   * Método de calcula el saldo de una cuenta corriente por un ingreso.
   * 
   * @param ingreso de una cantidad en euros en una cuenta corriente.
   */
  public void ingreso(double ingreso) {
    saldo += ingreso;
  }
  
  /**
   * Método que calcula el saldo de una cuenta corriente por un cargo a cuenta.
   * 
   * @param cargo a una cuenta en euros.
   */
  public void cargo(double cargo) {
    saldo -= cargo;
  }
  
  /**
   * Método que calcula el saldo de una cuenta corriente luego de haber hecho
   * y recibido una transferencia.
   * 
   * @param cuenta a la que se le hace la transferencia.
   * @param montoTransferencia cantidad de dinero que se transfiere.
   */
  public void transferencia(CuentaCorriente cuenta, double montoTransferencia) {
    cuenta.saldo += montoTransferencia;
    saldo -= montoTransferencia;
  }

}
