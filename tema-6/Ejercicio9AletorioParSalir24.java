package tema6;

import java.util.Scanner;

/**
 *Realiza un programa que vaya generando números aleatorios pares entre 0
 *y 100 y que no termine de generar números hasta que no saque el 24. El
 *programa deberá decir al final cuántos números se han generado.
 * 
 * @author Ander De Abrisqueta Rangel
 */
public class Ejercicio9AletorioParSalir24 {

  /**
   * @param args the command line arguments
   */
  public static void main(String args[]) {
    Scanner s = new Scanner(System.in);
    
    System.out.println("Programa que muestra los números pares aleatorios entre 0 y 100\n");
    
    int numeroAleatorio = 0;
    boolean esPar = true;
    int numeroPares = 0;
    boolean numeroSalida = true;
    
    do { 
      numeroSalida = true;
      numeroAleatorio = (int)(Math.random() * 101);
      esPar = numeroAleatorio % 2 == 0;
      
      if (esPar) {
        System.out.println(numeroAleatorio);
        numeroPares++;
      } 
      
      if (numeroAleatorio == 24){
        numeroSalida = false;
      }
      
    } while (numeroSalida);
    
    System.out.println("Se calcularon " + numeroPares + " pares");
  }
}
