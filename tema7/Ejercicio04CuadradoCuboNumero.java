package tema7;

import java.util.Scanner;

/**
 *
 * @author Ander De Abrisqueta Rangel
 */
public class Ejercicio04CuadradoCuboNumero {

  /**
   * @param args the command line arguments
   */
  public static void main(String args[]) {
    Scanner s = new Scanner(System.in);

    int numero[] = new int[20];
    int cuadrado[] = new int[20];
    int cubo[] = new int[20];

    for (int i = 0; i < 20; i++) {
      numero[i] = (int) (Math.random() * (100 + 1));
      cuadrado[i] = (int) Math.pow(numero[i], 2);
      cubo[i] = (int) Math.pow(numero[i], 3);
    }

    System.out.println("*****************************");
    System.out.println(" Número | Cuadrado | Cubo");
    System.out.println("*****************************");

    for (int i = 0; i < 20; i++) {
      System.out.printf("%4d    | %5d    | %4d\n", numero[i], cuadrado[i], cubo[i]);
      System.out.println("");

    }
    System.out.println("*****************************");
  }
}
