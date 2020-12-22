package tema6;

import java.util.Scanner;

/**
 *Escribe un programa que muestre la tirada de tres dados. Se debe mostrar
 *también la suma total (los puntos que suman entre los tres dados).
 * 
 * @author Ander De Abrisqueta Rangel
 */
public class Ejercicio1Tirada3Dados {

  /**
   * @param args the command line arguments
   */
  public static void main(String args[]) {
    Scanner s = new Scanner(System.in);
    
    System.out.println("Programa que muestra la tirada de tres dados \n");
    
    int tiradaDados = 0;
    int sumaDados = 0;
    
    for (int i = 1; i < 4; i++) {
      tiradaDados = ((int)(Math.random() * 6) + 1);
      System.out.print("El valor de la tirada del dado " + i + " es: " + tiradaDados + "  \n");
      sumaDados += tiradaDados;
      
    }
    
    System.out.println("La sumatoria de las tres tiras es: " + sumaDados);
  }
}
