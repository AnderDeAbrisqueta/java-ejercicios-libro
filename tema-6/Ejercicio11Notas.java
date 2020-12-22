package tema6;

import java.util.Scanner;

/**
 *Escribe un programa que muestre 20 notas generadas al azar. Las notas deben
 *aparecer de la forma: suspenso, suficiente, bien, notable o sobresaliente. Al
 *final aparecerá el número de suspensos, el número de suficientes, el número
 *de bienes, etc.
 * 
 * @author Ander De Abrisqueta Rangel
 */
public class Ejercicio11Notas {

  /**
   * @param args the command line arguments
   */
  public static void main(String args[]) {
    Scanner s = new Scanner(System.in);
   
    int numeroAleatorio = 0;
    int suspenso = 0;
    int suficiente = 0;
    int bien = 0;
    int notable = 0;
    int sobresaliente = 0;
    
    for (int i = 0; i < 20; i++) {
      numeroAleatorio = (int)(Math.random() * 11);
      //System.out.print(numeroAleatorio + " ");
      
      if (numeroAleatorio < 5) {
        System.out.println("La nota es " + numeroAleatorio + " (suspenso)");
        suspenso++;
      } else if ((numeroAleatorio >= 5) && (numeroAleatorio < 6)) {
        System.out.println("La nota es " + numeroAleatorio + " (suficiente)");
        suficiente++;
      } else if ((numeroAleatorio >= 6) && (numeroAleatorio < 8)) {
        System.out.println("La nota es " + numeroAleatorio + " (bien)");
        bien++;
      } else if ((numeroAleatorio >= 8) && (numeroAleatorio < 9)) {
        System.out.println("La nota es " + numeroAleatorio + " (notable)");
        notable++;
      } else if (numeroAleatorio > 9) {
        System.out.println("La nota es " + numeroAleatorio + " (sobresaliente)");
        sobresaliente++;
      }
      
    }
    
    System.out.println("");
    System.out.println("Resumen:");
    System.out.println("Número de suspensos: " + suspenso);
    System.out.println("Número de suficientes: " + suficiente);
    System.out.println("Número de bien: " + bien);
    System.out.println("Número de notables: " + notable);
    System.out.println("Número de sobresaliente: " + sobresaliente);
  }
}
