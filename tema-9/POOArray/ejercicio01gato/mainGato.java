/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio01gato;

import java.util.Scanner;

/**
 *
 * @author Ander De Abrisqueta Rangel
 */
public class mainGato {

  /**
   * @param args the command line arguments
   */
  public static void main(String args[]) {
    Scanner s = new Scanner(System.in);
    Gato[] gato = new Gato[4];
    
    System.out.println("Por favor, introduce los datos de los Gatos: ");
    
    for (int i = 0; i < 4; i++) {
      System.out.print("Nombre: ");
      String nombre = s.nextLine();
      System.out.print("Raza: ");
      String raza = s.nextLine();
      System.out.print("Color: ");
      String color = s.nextLine();
      gato[i] = new Gato(nombre, raza, color);
      System.out.println("");
    }
    
    System.out.println("");
    
    for (Gato gato1 : gato) {
      System.out.println(gato1);
    }
      
  }
}
