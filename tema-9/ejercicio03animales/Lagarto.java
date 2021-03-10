/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio03animales;

/**
 *
 * @author Ander De Abrisqueta Rangel
 */
public class Lagarto extends Animal {

  public Lagarto() {
  }

  public Lagarto(Sexo sexo) {
    super(sexo);
  }
  
  public void calientate() {
    System.out.println("!Estoy tomando el sol¡");
  }
  
  public void nada() {
    System.out.println("!Estoy nadando!");
  }
  
  public void mueveLaCola() {
    System.out.println("!Estoy moviendo la cola¡");
  }
}
