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
public class Pinguino extends Ave {

  public Pinguino() {
  }

  public Pinguino(Sexo sexo) {
    super(sexo);
  }
  
  @Override
  public void vuela() {
    System.out.println("No puedo volar");
  }
  
  public void nada() {
    System.out.println("!Estoy nadando¡");
  }
  
  public void protege() {
    System.out.println("Ando en círculos alrededor de la bandada para protegerlos del frío");
  }
}
