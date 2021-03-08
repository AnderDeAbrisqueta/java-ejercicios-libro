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
public abstract class Publicacion {
  private String isbn;
  private String titulo;
  private int ano;

  public Publicacion(String isbn, String titulo, int ano) {
    this.isbn = isbn;
    this.titulo = titulo;
    this.ano = ano;
  }

  @Override
  public String toString() {
    return "ISBN: " + isbn + ", titulo: " + titulo + ", año de publicación: " 
            + ano;
  }
  
}
