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
public class Perro extends Mamifero {

  private String raza = "";

  public Perro(Sexo s, String r) {
    super(s);
    this.raza = r;
  }

  public void ladra() {
    System.out.println("Guao guao guao");
  }

  public void daLaPata() {
    System.out.println("Toma mi pata");
  }

  public void juega() {
    System.out.println("Quiero correr, tira la pelota");
  }

}
