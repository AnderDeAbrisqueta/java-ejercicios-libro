/*
 *Realiza el control de acceso a una caja fuerte. La combinación será un
 *número de 4 cifras. El programa nos pedirá la combinación para abrirla. Si no
 *acertamos, se nos mostrará el mensaje “Lo siento, esa no es la combinación”
 *y si acertamos se nos dirá “La caja fuerte se ha abierto satisfactoriamente”.
 *Tendremos cuatro oportunidades para abrir la caja fuerte.
 */
package ejercicio7cajafuerte;

import java.util.Scanner;

/**
 *
 * @Ander De Abrisqueta Rangel
 */
public class Ejercicio7CajaFuerte {

  /**
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    System.out.println("Programa de control de acceso a la caja fuerte");
    
    Scanner s = new Scanner(System.in);
    
    final int claveCorrecta = 1857;
        
    for (int intentos = 1; intentos <= 4; intentos++) {
      System.out.print("Por favor, introduzca la clave (4 dígitos) de la caja fuerte: ");
      int clave = Integer.parseInt(s.nextLine());
      System.out.println("");
      
      if (clave == claveCorrecta){
       System.out.println("Clave correcta");
       intentos = 4;
      } else {
          System.out.println("Clave incorrecta, llevas: " + intentos + " intentos");
      }
        
    }
      System.out.println("Has excedido el número de intentos");
  }
}
