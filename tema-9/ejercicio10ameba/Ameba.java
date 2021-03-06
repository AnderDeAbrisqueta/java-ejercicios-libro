/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio10ameba;

/**
 *
 * @author Ander De Abrisqueta Rangel
 */
public class Ameba {
  private int peso; // Número entero que indica los mg que pesa el microorganismo

  public Ameba() {
    this.peso = 3;
  }

  @Override
  public String toString() {
    return "Soy una ameba y peso " + peso + " microgramos";
  }
  
  
  public void come(int pesoParticula) {
    this.peso += pesoParticula - 1; // Pierde 1 mg por fagocitar
  }
  
  public void come(Ameba a) {
    this.peso += a.peso - 1; // Pierde 1 mg por fagocitar
    a.peso = 0;
  }
}
