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
public class Gato extends Mamifero {

  private String raza = "";

  public Gato(Sexo s, String r) {
    super(s);
    this.raza = r;
  }

  public void ronronea() {
    System.out.println("Rrrrrrrrrr.....");
  }

  public void maulla() {
    System.out.println("miau miau miau miau .... ");
  }

  public void limpiate() {
    System.out.println("Me estoy lamiendo para asearme");
  }

  public void caza() {
    System.out.println("Estoy cazando ratones");
  }

}
