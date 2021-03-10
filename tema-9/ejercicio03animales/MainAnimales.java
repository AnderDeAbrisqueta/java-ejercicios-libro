/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio03animales;

/**
 *
 * @author alumno
 */
public class MainAnimales {

  /**
   * @param args the command line arguments
   */
  public static void main(String args[]) {
    Perro Mía = new Perro(Animal.Sexo.HEMBRA);
    Mía.juega();
    Mía.daLaPata();
    Mía.amamanta();
    Mía.cuidaCrias();
    
    Pinguino Joe = new Pinguino();
    Joe.vuela();
  }
}
