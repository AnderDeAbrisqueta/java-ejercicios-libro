package tema6;

import java.util.Scanner;

/**
 *Muestra 20 números enteros aleatorios entre 0 y 10 (ambos incluidos) separa-
 *dos por espacios.
 * 
 * @author Ander De Abrisqueta Rangel
 */
public class Ejercicio4Aleatorios0A10 {

  /**
   * @param args the command line arguments
   */
  public static void main(String args[]) {
    Scanner s = new Scanner(System.in);
    
    System.out.print("Programa muestra 20 números enteros aleatorios entre 0 y 10\n");
    
    int numeroAleatorio = 0;
    
    for (int i = 0; i < 20; i++) {
      numeroAleatorio = (int)(Math.random() * 11);
      System.out.print(numeroAleatorio + " ");
    }
    
    System.out.println("");
  }
}
