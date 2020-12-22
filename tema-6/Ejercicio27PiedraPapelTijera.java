package tema6;

import java.util.Scanner;

/**
 * Implementa el juego piedra, papel y tijera. Primero, el usuario introduce su
 * jugada y luego el ordenador genera al azar una de las opciones. Si el usuario
 * introduce una opción incorrecta, el programa deberá mostrar un mensaje de
 * error.
 *
 * @author Ander De Abrisqueta Rangel
 */
public class Ejercicio27PiedraPapelTijera {

  /**
   * @param args the command line arguments
   */
  public static void main(String args[]) {
    Scanner s = new Scanner(System.in);

    boolean esCorrectaJugada = false;
    String jugadaJugador = "";
    String piedra = "piedra";
    String papel = "papel";
    String tijera = "tijera";

    do {
      System.out.print("Por favor, introduce tu jugada (Piedra, Papel o Tijera): ");
      jugadaJugador = s.nextLine().toLowerCase();

      if ((jugadaJugador.equals(piedra)) || (jugadaJugador.equals(papel)) || (jugadaJugador.equals(tijera))) {
        esCorrectaJugada = true;

      }

    } while (!esCorrectaJugada);

    int jugadaOrdenador = (int) (Math.random() * 3);
    String jugadaOrdenadorString = "";

    switch (jugadaOrdenador) {
      case 0:
        jugadaOrdenadorString = "piedra";
        break;

      case 1:
        jugadaOrdenadorString = "papel";
        break;

      case 2:
        jugadaOrdenadorString = "tijera";
        break;
      default:
    }// Fin del switch

    System.out.println("El jugador sacó " + jugadaJugador + " y el ordenador " + jugadaOrdenadorString);

    if ((jugadaJugador.equals(piedra)) && (jugadaOrdenadorString.equals(papel))) {
      System.out.println("Gana el ordenador");

    } else if ((jugadaJugador.equals(piedra)) && (jugadaOrdenadorString.equals(tijera))) {
      System.out.println("Gana el jugador");

    } else if ((jugadaJugador.equals(papel)) && (jugadaOrdenadorString.equals(piedra))) {
      System.out.println("Gana el jugador");

    } else if ((jugadaJugador.equals(papel)) && (jugadaOrdenadorString.equals(tijera))) {
      System.out.println("Gana el ordenador");

    } else if ((jugadaJugador.equals(tijera)) && (jugadaOrdenadorString.equals(piedra))) {
      System.out.println("Gana el ordenador");

    } else if ((jugadaJugador.equals(tijera)) && (jugadaOrdenadorString.equals(papel))) {
      System.out.println("Gana el jugador");

    } else {
      System.out.println("Han empatado");
    }
  }
}
