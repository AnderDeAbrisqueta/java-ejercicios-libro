/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio02gatoampliacion;


/**
 *
 * @author Ander De Abrisqueta Rangel
 */
public class mainGato {

  /**
   * @param args the command line arguments
   */
  public static void main(String args[]) {
    Gato[] gato = new Gato[4];
    
    System.out.println("Los gatos son:\n");
    gato[0] = new Gato("Garfield", "amarillo", "macho");
    gato[1] = new Gato("Silvestre", "negro", "macho");
    gato[2] = new Gato("Tom", "gris", "macho");
    gato[3] = new Gato("Mía", "blanca", "hembra");
    
    for (Gato gato1 : gato) {
      System.out.println(gato1);
    }
      
    gato[3].setColor("rojo");
    System.out.println(gato[3]);
  }
}
