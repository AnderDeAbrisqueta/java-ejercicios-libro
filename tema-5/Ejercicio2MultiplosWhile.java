/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio2multiploswhile;

/**
 *
 * @author alumno
 */
public class Ejercicio2MultiplosWhile {

  /**
   * Muestra los números múltiplos de 5 de 0 a 100 utilizando un bucle while.
   * 
   * @Ander De Abrisqueta Rangel
   */
  public static void main(String[] args) {
    int numero = 0; 
    
    while (numero < 100) {
      numero += 5;
      System.out.println(numero);
    }
  }
  
}
