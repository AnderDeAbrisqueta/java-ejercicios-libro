package tema6;

import java.util.Scanner;

/**
 * Escribe un programa que, dado un número introducido por teclado, elija al
 * azar uno de sus dígitos.
 *
 * @author Ander De Abrisqueta Rangel
 */
public class Ejercicio24DigitosAzar {

  /**
   * @param args the command line arguments
   */
  public static void main(String args[]) {
    Scanner s = new Scanner(System.in);

    System.out.print("Por favor, introduzca un número entero positivo: ");
    long numeroIntroducido = Long.parseLong(s.nextLine());

    long numero = numeroIntroducido;
    int longitud = 0;
    
    //Longitud

    while (numero > 0) {
      numero /= 10;
      longitud++;
    }
    
    //Elección de la posición
    
    int posicionDigito = (int)(Math.random() * longitud + 1);
    int digitoElegidoAzar = (int)((numeroIntroducido / Math.pow(10, longitud - posicionDigito)) % 10);
    System.out.println("El dígito escogido al azar del número " + numeroIntroducido + " es " + digitoElegidoAzar);
  }
}
