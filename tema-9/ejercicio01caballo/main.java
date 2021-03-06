/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio01caballo;

/**
 *
 * @author Ander De Abrisqueta RAngel
 */
public class main {

  /**
   * @param args the command line arguments
   */
  public static void main(String args[]) {
    Caballo bucefalo = new Caballo("Bucéfalo", 225.23);
    Caballo pegaso = new Caballo("Pegaso", 200.12);
    
    pegaso.compiteCon(bucefalo);
    bucefalo.corre();
    pegaso.come();
  }
}
