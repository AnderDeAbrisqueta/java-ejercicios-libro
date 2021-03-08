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
public class Libro extends Publicacion implements Prestable {

  private boolean prestado = false;

  public Libro(String isbn, String titulo, int ano) {
    super(isbn, titulo, ano);
  }

  @Override
  public String toString() {
    return super.toString() + " (" + (this.prestado ? "prestado" : "no prestado") + ")";
  }
  
  @Override
  public void presta() {
    if (this.prestado) {
      System.out.println("Lo siento, ese libro ya está prestado.");
    } else {
      this.prestado = true;
    }
  }

  @Override
  public void devuelve() {
    this.prestado = false;
  }
  
  @Override
  public boolean estaPrestado() {
    return this.prestado;
  }

}
