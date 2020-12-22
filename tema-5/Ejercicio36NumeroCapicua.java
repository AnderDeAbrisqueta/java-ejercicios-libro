package tema5;

import java.util.Scanner;

/**
 *Escribe un programa que diga si un número introducido por teclado es o no
 *capicúa. Los números capicúa se leen igual hacia delante y hacia atrás. El
 *programa debe aceptar números de cualquier longitud siempre que lo permita
 *el tipo, en caso contrario el ejercicio no se dará por bueno. Se recomienda usar
 *long en lugar de int ya que el primero admite números más largos.
 * 
 * @author Ander De Abrisqueta Rangel
 */
public class Ejercicio36NumeroCapicua {

  /**
   * @param args the command line arguments
   */
  public static void main(String args[]) {
    Scanner s = new Scanner(System.in);
    
    System.out.print("Introduzca un número: ");
    long numeroIntroducido = Long.parseLong(s.nextLine());
    
    
    long numero = numeroIntroducido;
    long volteado = 0;
    
    while (numero > 0) {   
      volteado = (volteado * 10) + (numero % 10);
      numero /= 10;
    }
    
    if (numeroIntroducido == volteado) {
      System.out.println("El " + numeroIntroducido + " es capicúa ");
    } else {
      System.out.println("El " + numeroIntroducido + " no es capicúa ");
    }  
  }
}
