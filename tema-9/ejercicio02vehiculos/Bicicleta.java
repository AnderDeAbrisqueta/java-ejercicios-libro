/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio02vehiculos;

/**
 *
 * @author Ander De Abrisqueta Rangel
 */
public class Bicicleta extends Vehiculo {

  private String tipoDeBicicleta = "";

  public Bicicleta(String tipoDeBici) {
    super();
    this.tipoDeBicicleta = tipoDeBici;
  }

  public void hazCaballito() {
    System.out.println("Estoy haciendo caballito...\n");
  }

}
