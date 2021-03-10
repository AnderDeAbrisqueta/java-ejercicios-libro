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
public class Mamifero extends Animal {

  public Mamifero() {
    super();
  }

  public Mamifero(Sexo s) {
    super(s);
  }

  public void amamanta() {
    if (this.getSexo() == Sexo.MACHO) {
      System.out.println("Soy macho, no puedo amamantar");
    } else {
      System.out.println("Toma pecho, come un poco");
    }
  }

  public void cuidaCrias() {
    System.out.println("Estoy cuidando mis crias");
  }
  
  public void anda() {
    System.out.println("Estoy andando");
  }
}
