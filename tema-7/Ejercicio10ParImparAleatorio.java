package tema7;

import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class Ejercicio10ParImparAleatorio {

  /**
   * @param args the command line arguments
   */
  public static void main(String args[]) {
    Scanner s = new Scanner(System.in);

    int[] numero = new int[20];
    int i;

    System.out.print("Array: ");
    //Generación de los números aleatorios
    for (i = 0; i < 20; i++) {
      numero[i] = (int) (Math.random() * 101);
      System.out.print(numero[i] + " ");
    }
    System.out.println("");

    //Clasificar pares e impares
    int[] numeroPar = new int[20];
    int[] numeroImpar = new int[20];
    int indicePar = 0;
    int indiceImpar = 0;

    for (i = 0; i < 20; i++) {
      if (numero[i] % 2 == 0) {
        numeroPar[indicePar++] = numero[i];
      } else {
        numeroImpar[indiceImpar++] = numero[i];
      }
    }

    //Colocación de los números pares en las primeras posiciones
    for (i = 0; i < indicePar; i++) {
      numero[i] = numeroPar[i];
    }
    
    for (i = indicePar; i < 20; i++) {
      numero[i] = numeroImpar[i - indicePar];
    }
    
    //Array clasificado en número pares e impares
    System.out.print("Array clasificado: ");
    for (i = 0; i < 20; i++) {
      System.out.print(numero[i] + " ");
    }
    System.out.println("");
  }
}
