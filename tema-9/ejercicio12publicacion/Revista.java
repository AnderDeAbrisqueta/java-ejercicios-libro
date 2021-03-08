/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio12publicacion;

/**
 *
 * @author Ander De Abrisqueta Rangel
 */
public class Revista extends Publicacion {
  private int numero;

  public Revista(String isbn, String titulo, int ano, int numero) {
    super(isbn, titulo, ano);
    this.numero = numero;
  }
  
}
