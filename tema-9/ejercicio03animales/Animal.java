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
public abstract class Animal {

  private Sexo sexo;

  public Animal() {
    this.sexo = sexo;
  }

  public Animal(Sexo sexo) {
    this.sexo = sexo;
  }

  public Sexo getSexo() {
    return sexo;
  }
  
  public enum Sexo {
    MACHO, HEMBRA;
  }

  public void duerme() {
    System.out.println("Zzzzzzz");
  }

  public void come(String comida) {
    System.out.println("Estoy comiendo " + comida);
  }

}
