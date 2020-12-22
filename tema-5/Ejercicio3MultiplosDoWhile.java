/*
 * Muestra los números múltiplos de 5 de 0 a 100 utilizando un bucle do-while.
 */
package ejercicio3multiplosdowhile;

/**
 *
 * @Ander De Abrisqueta Rangel
 */
public class Ejercicio3MultiplosDoWhile {

  /**
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    int numero = 0;
    
    do {  
      numero += 5;
      System.out.println(numero);
    } while (numero <= 95);
  }
  
}
