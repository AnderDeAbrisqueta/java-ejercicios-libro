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
public class Canario extends Ave {

  public Canario() {
  }

  public Canario(Sexo sexo) {
    super(sexo);
  }

  public void canta() {
    System.out.println("Prrriiiiiiiiii......");
  }
  
  @Override
  public void come(String comida) {
    System.out.println(comida.equalsIgnoreCase("alpiste") ? "!Que rico, muam, muam" 
            : "Gracias, pero solo me guata el alpiste");
  }
  
  public void salta() {
    System.out.println("!Estoy saltando....¡");
  }
  
}
