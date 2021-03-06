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

  private String sexo ="";
 
  public Animal(String s) {
    this.sexo = s;
  }

  public String getSexo() {
    return sexo;
  }


  public void duerme() {
    System.out.println("Zzzzzzz");
  }

  public void come(String comida) {
    System.out.println("Estoy comiendo " + comida);
  }

}
