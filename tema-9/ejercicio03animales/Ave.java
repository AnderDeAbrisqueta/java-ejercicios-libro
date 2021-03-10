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
public class Ave extends Animal {

  public Ave() {
    super(Sexo.HEMBRA);
  }

  public Ave(Sexo sexo) {
    super(sexo);
  }

  public void ponHuevo() {
    System.out.println(this.getSexo().equals(Sexo.MACHO)
            ? "Soy macho, no puedo poner huevos" : "¡Estoy poniendo un huevo!");
  }

  public void vuela() {
    System.out.println("¡Estoy volando!");
  }

  public void aseate() {
    System.out.println("¡Me estoy limpiando las plumas!");
  }

}
