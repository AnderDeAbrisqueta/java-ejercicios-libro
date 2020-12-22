package tema5;

import java.util.Scanner;

/**
 *Realiza un programa que pinte un reloj de arena relleno hecho de asteriscos. El
 *programa debe pedir la altura. Se debe comprobar que la altura sea un número
 *impar mayor o igual a 3, en caso contrario se debe mostrar un mensaje de error.
 * 
 * @author Ander De Abrisqueta Rangel
 */
public class Ejercicio38RelojArena {

  /**
   * @param args the command line arguments
   */
  public static void main(String args[]) {
    Scanner s = new Scanner(System.in);
    
    int altura;
    boolean datosValidos;
     
    do {      
      datosValidos = true;
      
      System.out.print("Por favor, introduzca la altura de la X: ");
      altura = Integer.parseInt(s.nextLine());
      System.out.println();
      
      if ((altura < 3) || (altura % 2 == 0)) {
       datosValidos = false;
       System.out.println("Datos incorrectos, la altura debe ser un número impar mayor o igual a 3");
      }
      
    } while (!datosValidos);
     
    int espaciosInternos1 = altura - 1;
    int espaciosIniciales1 = 0;
    int i = 0;
    int filas = 1;

      //Parte superior
      
    while (filas < altura / 2 + 1) {
      for (i = 1; i <= espaciosIniciales1; i++) {
        System.out.print(" ");
      }
      System.out.print("*");
      
      for (i = 1; i < espaciosInternos1; i++) {
       System.out.print("*");
      }
      System.out.print("*");
      
      System.out.println("");
      
      filas++;
      espaciosIniciales1++;
      espaciosInternos1 -= 2;
    }
      
    //Parte inferior
      
    int espaciosIniciales2 = altura / 2;
    int espaciosInternos2 = 0;
    int filas2 = 1;
      
    while (filas2 <= altura / 2 +1) {
     for (i = 1; i <= espaciosIniciales2; i++) {
       System.out.print(" ");
     }
       System.out.print("*");
      
     for (i = 1; i < espaciosInternos2; i++) {
       System.out.print("*");
     }
       if (filas2 > 1) {
        System.out.print("*");
        }

     System.out.println("");
        
     filas2 ++;
     espaciosIniciales2--;
     espaciosInternos2 += 2;
      
    }
  }
}
