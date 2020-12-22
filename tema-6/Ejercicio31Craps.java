package tema6;

import java.util.Scanner;

/**
 *
 * @author Ander De Abrisqueta Rangel
 */
public class Ejercicio31Craps {

  /**
   * @param args the command line arguments
   */
  public static void main(String args[]) {
    Scanner s = new Scanner(System.in);

    System.out.print("Por favor, introduzca su apuesta (€): ");
    int apuesta = Integer.parseInt(s.nextLine());

    int tiradaDado1 = (int) (Math.random() * 6 + 1);
    int tiradaDado2 = (int) (Math.random() * 6 + 1);

    System.out.println("Tirada del dado 1: " + tiradaDado1);
    System.out.println("Tirada del dado 2: " + tiradaDado2);

    int sumaDados = tiradaDado1 + tiradaDado2;

    System.out.println("Suma de las tiradas: " + sumaDados);
    System.out.println("");

    if ((sumaDados == 7) || (sumaDados == 11)) {
      System.out.println("¡Enhorabuena!, has ganado " + apuesta + " €");
      System.out.println("Tienes un total de " + apuesta * 2 + " €");

    } else if ((sumaDados == 2) || (sumaDados == 3) || (sumaDados == 12)) {
      System.out.println("Lo lamentamos, has perdido ");
      System.out.println("Pierdes toda tu apuesta");

    } else { // Segunda etapa del juego
      System.out.println("Segunda etapa del juego:");
      int sumaDadosEtapa2 = 0;
      boolean haGanadoPerdido = false;
      do {
        int tiradaDado1Etapa2 = (int) (Math.random() * 6 + 1);
        int tiradaDado2Etapa2 = (int) (Math.random() * 6 + 1);

        sumaDadosEtapa2 = tiradaDado1Etapa2 + tiradaDado2Etapa2;

        System.out.println("Tirada del dado 1, etapa 2: " + tiradaDado1Etapa2);
        System.out.println("Tirada del dado 2, etapa 2: " + tiradaDado2Etapa2);

        System.out.println("Suma de las tiradas, etapa 2: " + sumaDadosEtapa2);
        System.out.println("");

        if (sumaDadosEtapa2 == sumaDados) {
          System.out.println("¡Enhorabuena!, has ganado " + apuesta + " €");
          System.out.println("Tienes un total de " + apuesta * 2 + " €");
          haGanadoPerdido = true;

        } else if (sumaDadosEtapa2 == 7) {
          System.out.println("Lo lamentamos, has perdido ");
          System.out.println("Pierdes toda tu apuesta");
          haGanadoPerdido = true;

        } else {
          haGanadoPerdido = false;

        }
        System.out.println("");

      } while (!haGanadoPerdido);

    }

  }
}
