package tema5;

import java.util.Scanner;

/**
 * Realiza un programa que pida primero un número y a continuación un dígito. El
 * programa nos debe dar la posición (o posiciones) contando de izquierda a
 * derecha que ocupa ese dígito en el número introducido.
 *
 * @author Ander De Abrisqueta Rangel
 */
public class Ejercicio26PedirDigito {

  /**
   * @param args the command line arguments
   */
  public static void main(String args[]) {
    Scanner s = new Scanner(System.in);

    System.out.print("Por favor, introduzca un número entero positivo: ");
    long numeroIntroducido = Long.parseLong(s.nextLine());

    System.out.print("Por favor, elija un digito: ");
    int digitoElegido = Integer.parseInt(s.nextLine());
   
    long numero = numeroIntroducido;
    int longitud = 0;
    long volteado = 0;
    int posicionDigitoElegido = 1;
    
    System.out.println("");
    
    System.out.print("La(s) posición(es) del dígito escogido del número " + numeroIntroducido + " es(son) la(s)  ");

    if (numero == 0) {
      longitud = 1;
    }

    //Longitud
    while (numero > 0) {
      volteado = (volteado * 10) + (numero % 10);
      numero /= 10;
      longitud++;
    }

    //Elección de la posición
    do {
      if ((volteado % 10) == digitoElegido) {
        System.out.print(posicionDigitoElegido + " ");

      }
      volteado /= 10;
      posicionDigitoElegido++;

    } while (volteado > 0);

    
  }
}
