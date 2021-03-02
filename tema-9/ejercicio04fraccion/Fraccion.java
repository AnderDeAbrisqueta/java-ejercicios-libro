/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio04fraccion;

/**
 *
 * @author Ander De Abrisqueta Rangel
 */
public class Fraccion {

  private int numerador;
  private int denominador;
  private int signo;

  public Fraccion() {
  }

  public Fraccion(int numerador, int denominador) {
    if (numerador == 0 && denominador == 0) {
      System.out.println("Indeterminación");

    } else if (denominador == 0) {
      System.out.println("Es un número infinito");

    } else {
      if (numerador * denominador < 0) {
        this.signo = -1;
      } else {
        this.signo = 1;
      }
      this.numerador = Math.abs(numerador);
      this.denominador = Math.abs(denominador);
    }

  }

  public int getNumerador() {
    return this.numerador;
  }

  public int getDenominador() {
    return this.denominador;
  }

  @Override
  public String toString() {
    if (this.signo == -1) {
      return (this.signo * this.numerador) + "/" + this.denominador;
    } else {
      return this.numerador + "/" + this.denominador;
    }

  }

  /**
   * Método que invierte una fracción.
   *
   * @return fracción invertida
   */
  public Fraccion invierte() {
    return new Fraccion(this.signo * this.denominador, this.numerador);
  }
  
  /**
   * Este método calcula el producto entre dos fracciones.
   * 
   * @param f2 fracción que se multiplica por la fracción inicial.
   * @return el resultado del producto de dos fracciones.
   */
  public Fraccion multiplica(Fraccion f2) {
    return new Fraccion(this.signo * this.numerador * f2.getNumerador() * f2.signo, this.denominador * f2.getDenominador());
  }
  
  /**
   * Método que calcula el producto entre una fracción y un número entero.
   * 
   * @param numero entero
   * @return el producto de la fracción y el número entero
   */
  public Fraccion multiplica(int numero) {
    return new Fraccion(this.signo * this.numerador * numero, this.denominador);
  }
  
  /**
   * Método que calcula la división de dos fracciones.
   * 
   * @param f2 fracción que divide a la fracción inicial.
   * @return la fracción resultado de la división entre la primera fracción y la segunda.
   */
  public Fraccion divide(Fraccion f2) {
    return new Fraccion(this.signo * this.numerador * f2.getDenominador() * f2.signo, this.denominador * f2.getNumerador());
  }
  
  /**
   * Método que divide una fracción con un número entero.
   * 
   * @param numero entero
   * @return una fración
   */
  public Fraccion divide(int numero) {
    return new Fraccion(this.signo * this.numerador,this.denominador * numero);
  }
  
  public Fraccion simplifica () {
    for (int i = 2; i < Math.min(this.numerador, this.denominador); i++) {
      while (this.numerador % i == 0 && this.denominador % i == 0) {        
        this.numerador /= i;
        this.denominador /= i;
      }
      
    }
    
    return new Fraccion(this.signo * this.numerador, this.denominador);
  }

}
