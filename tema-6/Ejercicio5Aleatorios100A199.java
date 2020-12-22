package tema6;

import java.util.Scanner;

/**
 *Muestra 50 números enteros aleatorios entre 100 y 199 (ambos incluidos)
 *separados por espacios. Muestra también el máximo, el mínimo y la media
 *de esos números.
 * 
 * @author Ander De Abrisqueta Rangel
 */
public class Ejercicio5Aleatorios100A199 {

  /**
   * @param args the command line arguments
   */
  public static void main(String args[]) {
    Scanner s = new Scanner(System.in);
    
    System.out.print("Programa muestra 50 números enteros aleatorios entre 100 y 199\n");
    
    int numeroAleatorio = 0;
    int sumaNumeroAleatorio = 0;
    int mediaNumeroAleatorios = 0;
    int numeroAleatorioMayor = 100;
    int numeroAleatorioMenor = 199;
    
    for (int i = 1; i < 51; i++) {
      numeroAleatorio = (int)((Math.random() * 100) + 100);
      System.out.print(numeroAleatorio + " ");
      sumaNumeroAleatorio += numeroAleatorio;
      mediaNumeroAleatorios = sumaNumeroAleatorio / i;
            
      if (numeroAleatorio > numeroAleatorioMayor) {
        numeroAleatorioMayor = numeroAleatorio;
        
      } 
      
      if (numeroAleatorio < numeroAleatorioMenor) {
        numeroAleatorioMenor = numeroAleatorio;
      }
      
    }
    System.out.println("");
    System.out.println("\nMínimo: " + numeroAleatorioMenor + "\nMáximo: " + numeroAleatorioMayor + "\nMedia:  " + mediaNumeroAleatorios);
    
    System.out.println("");
  }
}
