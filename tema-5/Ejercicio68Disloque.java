package tema5;

import java.util.Scanner;

/**
 *
 * @author Ander De Abrisqueta Rangel
 */
public class Ejercicio68Disloque {

  /**
   * @param args the command line arguments
   */
  public static void main(String args[]) {
    Scanner s = new Scanner(System.in);

    System.out.print("Por favor, introduza un número entero positivo: ");
    long numeroIntroducido = Long.parseLong(s.nextLine());

    long numero = numeroIntroducido;
    int digito = 0;
    long dislocadoInverso = 0;


    while (numero > 0) {
      digito = (int) numero % 10;
      
      if (digito % 2 == 0) {
        digito++;
      } else {
        digito--;
      }
      dislocadoInverso = dislocadoInverso * 10 + digito;
      numero /= 10;
    }
    
    long dislocado = 0;
    
    while (dislocadoInverso > 0) {     
      dislocado = dislocado * 10 + dislocadoInverso % 10;
      dislocadoInverso /= 10;
      
    }
    System.out.println("Dislocando el " + numeroIntroducido + " sale el " + dislocado);
    
  }
}
