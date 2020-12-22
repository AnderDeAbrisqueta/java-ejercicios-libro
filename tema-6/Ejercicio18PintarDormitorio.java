package tema6;

import java.util.Scanner;

/**
 * Sinestesio y Casilda van a pintar los tres dormitorios de su casa, quieren
 * sustituir el color blanco por colores más alegres. Realiza un programa que
 * genere de forma aleatoria una secuencia de tres colores aleatorios (uno para
 * cada dormitorio) de tal forma que no se repita ninguno. Los colores entre los
 * que debe elegir el programa son los siguientes: rojo, azul, verde, amarillo,
 * violeta y naranja.
 *
 * @author Ander De Abrisqueta Rangel
 */
public class Ejercicio18PintarDormitorio {

  /**
   * @param args the command line arguments
   */
  public static void main(String args[]) {
    Scanner s = new Scanner(System.in);
    
    int colorDormitorio1 = 0;
    int colorDormitorio2 = 0;
    int colorDormitorio3 = 0;
    
    do {      
      colorDormitorio1 = (int) (Math.random() * 6);
      colorDormitorio2 = (int) (Math.random() * 6);
      colorDormitorio3 = (int) (Math.random() * 6);
      
    } while (colorDormitorio1 == colorDormitorio2 || colorDormitorio2 == colorDormitorio3 || colorDormitorio1 == colorDormitorio3);

    String color = "";

      switch (colorDormitorio1) {
        case 0:
          color = "rojo";
          break;

        case 1:
          color = "azul";
          break;

        case 2:
          color = "verde";
          break;

        case 3:
          color = "amarillo";
          break;

        case 4:
          color = "violeta";
          break;

        case 5:
          color = "naranja";
          break;
        default:
      }// Fin del switch

      System.out.print("El dormitorio 1 se pintará de color " + color);
      System.out.println("");
      
      switch (colorDormitorio2) {
        case 0:
          color = "rojo";
          break;

        case 1:
          color = "azul";
          break;

        case 2:
          color = "verde";
          break;

        case 3:
          color = "amarillo";
          break;

        case 4:
          color = "violeta";
          break;

        case 5:
          color = "naranja";
          break;
        default:
      }// Fin del switch

      System.out.print("El dormitorio 2 se pintará de color " + color);
      System.out.println("");
      
      switch (colorDormitorio3) {
        case 0:
          color = "rojo";
          break;

        case 1:
          color = "azul";
          break;

        case 2:
          color = "verde";
          break;

        case 3:
          color = "amarillo";
          break;

        case 4:
          color = "violeta";
          break;

        case 5:
          color = "naranja";
          break;
        default:
      }// Fin del switch

      System.out.print("El dormitorio 3 se pintará de color " + color);
      System.out.println("");
  }
}
