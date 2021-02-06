/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema8;

import java.util.Scanner;

/**
 *
 * @author Ander De Abrisqueta Rangel
 */
public class Ejercicio37ClaveMorse {

  /**
   * @param args the command line arguments
   */
  public static void main(String args[]) {
    Scanner s = new Scanner(System.in);
    System.out.print("Por favor, introduza el número que quiere convertir en clave morse: ");
    int n = Integer.parseInt(s.nextLine());
    System.out.println(convierteEnMorse(n));
  }

  public static String convierteEnMorse(int n) {
    String claveMorse = "";
    String clave = "";
    int digito = 0;

    for (int i = 0; i < misfunciones.Matematicas.digitos(n); i++) {
      switch (misfunciones.Matematicas.digitoN(n, i)) {
        case 0:
          clave = "  _ _ _ _ _  ";
          break;
        case 1:
          clave = "  . _ _ _ _  ";
          break;
        case 2:
          clave = "  . . _ _ _  ";
          break;
        case 3:
          clave = "  . . . _ _  ";
          break;
        case 4:
          clave = "  . . . . _  ";
          break;
        case 5:
          clave = "  . . . . .  ";
          break;
        case 6:
          clave = "  _ . . . .  ";
          break;
        case 7:
          clave = "  _ _ . . .  ";
          break;
        case 8:
          clave = "  _ _ _ . .  ";
          break;
        case 9:
          clave = "  _ _ _ _ .  ";
          break;
        default:
      }
      claveMorse += clave;
    }
    return claveMorse;
  }
}
