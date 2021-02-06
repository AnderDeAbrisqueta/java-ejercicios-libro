/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema8;

import java.util.Scanner;
import static tema8.Ejercicio37ClaveMorse.convierteEnMorse;

/**
 *
 * @author Ander De Abrisqueta Rangel
 */
public class Ejercicio39DigitosPalabras {

  /**
   * @param args the command line arguments
   */
  public static void main(String args[]) {
    Scanner s = new Scanner(System.in);
    System.out.print("Por favor, introduza el número que quiere convertir en palabras: ");
    int n = Integer.parseInt(s.nextLine());
    System.out.println(convierteEnPalabras(n));
  }

  public static String convierteEnPalabras(int n) {
    String palabras = "";
    String d = "";

    for (int i = 0; i < misfunciones.Matematicas.digitos(n); i++) {
      switch (misfunciones.Matematicas.digitoN(n, i)) {
        case 0:
          d = " cero";
          break;
        case 1:
          d = " uno";
          break;
        case 2:
          d = " dos";
          break;
        case 3:
          d = " tres";
          break;
        case 4:
          d = " cuatro";
          break;
        case 5:
          d = " cinco";
          break;
        case 6:
          d = " seis";
          break;
        case 7:
          d = " siete";
          break;
        case 8:
          d = " ocho";
          break;
        case 9:
          d = " nueve";
          break;
        default:
      }
      palabras += d;
      if (i < misfunciones.Matematicas.digitos(n) - 1) {
        palabras = palabras + ",";
      }
    }

    return palabras;
  }
}
