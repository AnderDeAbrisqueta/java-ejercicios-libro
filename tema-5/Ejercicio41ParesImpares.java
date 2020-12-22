package tema5;

import java.util.Scanner;

/**
 *Escribe un programa que diga cuántos dígitos pares y cuántos dígitos impares
 *hay dentro de un número. Se recomienda usar long en lugar de int ya que el
 *primero admite números más largos.
 * 
 * @author Ander De Abrisqueta Rangel
 */
public class Ejercicio41ParesImpares {

  /**
   * @param args the command line arguments
   */
  public static void main(String args[]) {
    Scanner s = new Scanner(System.in);
    
    System.out.print("Por favor, introduza un número entero positivo: ");
    long numeroIntroducido = Long.parseLong(s.nextLine());
    
    long numero = numeroIntroducido;
    long numeroInverso = 0;
    int longitud = 0;
    
    while (numero > 0) {   
      numeroInverso = (numeroInverso * 10) + (numero % 10);
      numero /= 10;
      longitud++;
    } 
    
    int digito;
    int digitosPares = 0;
    int digitosImpares = 0;
    
    for (int i = 0; i < longitud; i++) {
      digito = (int)(numeroInverso % 10);
      
      if (numeroInverso % 2 == 0) {
        digitosPares++;
      } else {
        digitosImpares++;
      }
      
        numeroInverso /= 10;
    }
    
    System.out.print("El número " + numeroIntroducido + " contiene "); 
    
    if ((digitosPares == 1) && ((digitosImpares > 1)) || (digitosImpares == 0)) {

     System.out.print(digitosPares + " número par y " + digitosImpares + " números impares.\n");
      
    } else if (((digitosPares == 0) || (digitosPares > 1)) && (digitosImpares == 1)) {
        System.out.print(digitosPares + " números pares y " + digitosImpares + " número impar.\n");
    
    } else if ((digitosPares == 1) && (digitosImpares == 1)) {
        System.out.print(digitosPares + " número par y " + digitosImpares + " número impar.\n");
    
    } else {
        System.out.print(digitosPares + " números pares y " + digitosImpares + " números impares.\n");
    }
  }
}
