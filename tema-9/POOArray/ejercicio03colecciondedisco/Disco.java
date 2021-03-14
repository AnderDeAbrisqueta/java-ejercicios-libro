/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio03colecciondedisco;

/**
 *
 * @author Ander De Abrisqueta Rangel
 */
public class Disco {
  private String codigo = "Libre";
  private String grupo;
  private String titulo;
  private int year;
  private String genero;

  public Disco() {
  }

  public String getCodigo() {
    return codigo;
  }

  public String getGrupo() {
    return grupo;
  }

  public String getTitulo() {
    return titulo;
  }

  public int getYear() {
    return year;
  }

  public String getGenero() {
    return genero;
  }

  public void setCodigo(String codigo) {
    this.codigo = codigo;
  }

  public void setGrupo(String grupo) {
    this.grupo = grupo;
  }

  public void setTitulo(String titulo) {
    this.titulo = titulo;
  }

  public void setYear(int year) {
    this.year = year;
  }

  public void setGenero(String genero) {
    this.genero = genero;
  }

  @Override
  public String toString() {
    String cadena = "\n*********************************";
    cadena = "\n*     Colección de Discos       *";
    cadena = "\n*********************************";
    cadena += "\n Código: " + this.codigo;
    cadena += "\n Grupo: " + this.grupo;
    cadena += "\n Título: " + this.titulo;
    cadena += "\n Año: " + this.year;
    cadena += "\n Género: " + this.genero;
    cadena += "\n********************************";
    return cadena;
  }
 
}
