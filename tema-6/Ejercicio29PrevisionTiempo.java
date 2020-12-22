package tema6;

import java.util.Scanner;

/**
 *
 * @author Ander De Abrisqueta Rangel
 */
public class Ejercicio29PrevisionTiempo {

  /**
   * @param args the command line arguments
   */
  public static void main(String args[]) {
    Scanner s = new Scanner(System.in);

    System.out.println("1. Primavera");
    System.out.println("2. Verano");
    System.out.println("3. Otoño");
    System.out.println("4. Invierno");
    System.out.print("Seleccione la estación del año (1-4): ");
    int estacion = Integer.parseInt(s.nextLine());

    System.out.println("\n");
    System.out.println("Previsión del tiempo para mañana en Málaga");
    System.out.println("------------------------------------------");

    int temperaturaMinimaAbsolutaPrimavera = 15;
    int temperaturaMaximaAbsolutaPrimavera = 30;
    int temperaturaMinima = 0;
    int temperaturaMaxima = 0;
    String clima = "";

    if (estacion == 1) {

      int temperaturaPrimaveraMinima = (int) ((Math.random() * (temperaturaMaximaAbsolutaPrimavera - temperaturaMinimaAbsolutaPrimavera) + 1) + temperaturaMinimaAbsolutaPrimavera);
      int temperaturaPrimaveraMaxima = (int) ((Math.random() * (temperaturaMaximaAbsolutaPrimavera - temperaturaMinimaAbsolutaPrimavera) + 1) + temperaturaMinimaAbsolutaPrimavera);

      if (temperaturaPrimaveraMinima < temperaturaPrimaveraMaxima) {
        temperaturaMinima = temperaturaPrimaveraMinima;
        temperaturaMaxima = temperaturaPrimaveraMaxima;

      } else {
        temperaturaMaxima = temperaturaPrimaveraMinima;
        temperaturaMinima = temperaturaPrimaveraMaxima;
      }

      int probabilidadSoleadoNublado = (int) (Math.random() * 10);

      switch (probabilidadSoleadoNublado) {
        case 0:
        case 1:
        case 2:
        case 3:
        case 4:
        case 5:
          clima = "Soleado";
          break;
        case 6:
        case 7:
        case 8:
        case 9:
          clima = "Nublado";
          break;
        default:

      }
    }
    int temperaturaMinimaAbsolutaVerano = 25;
    int temperaturaMaximaAbsolutaVerano = 45;
    
    if (estacion == 2) {

      int temperaturaVeranoMinima = (int) ((Math.random() * (temperaturaMaximaAbsolutaVerano - temperaturaMinimaAbsolutaVerano) + 1) + temperaturaMinimaAbsolutaVerano);
      int temperaturaVeranoMaxima = (int) ((Math.random() * (temperaturaMaximaAbsolutaVerano - temperaturaMinimaAbsolutaVerano) + 1) + temperaturaMinimaAbsolutaVerano);

      if (temperaturaVeranoMinima < temperaturaVeranoMaxima) {
        temperaturaMinima = temperaturaVeranoMinima;
        temperaturaMaxima = temperaturaVeranoMaxima;

      } else {
        temperaturaMaxima = temperaturaVeranoMinima;
        temperaturaMinima = temperaturaVeranoMaxima;
      }

      int probabilidadSoleadoNublado = (int) (Math.random() * 10);

      switch (probabilidadSoleadoNublado) {
        case 0:
        case 1:
        case 2:
        case 3:
        case 4:
        case 5:
        case 6:
        case 7:
          clima = "Soleado";
          break;
        case 8:
        case 9:
          clima = "Nublado";
          break;
        default:

      }
    }
    
    int temperaturaMinimaAbsolutaOtono = 20;
    int temperaturaMaximaAbsolutaOtono = 30;
    
    if (estacion == 3) {

      int temperaturaOtonoMinima = (int) ((Math.random() * (temperaturaMaximaAbsolutaOtono - temperaturaMinimaAbsolutaOtono) + 1) + temperaturaMinimaAbsolutaOtono);
      int temperaturaOtonoMaxima = (int) ((Math.random() * (temperaturaMaximaAbsolutaOtono - temperaturaMinimaAbsolutaOtono) + 1) + temperaturaMinimaAbsolutaOtono);

      if (temperaturaOtonoMinima < temperaturaOtonoMaxima) {
        temperaturaMinima = temperaturaOtonoMinima;
        temperaturaMaxima = temperaturaOtonoMaxima;

      } else {
        temperaturaMaxima = temperaturaOtonoMinima;
        temperaturaMinima = temperaturaOtonoMaxima;
      }

      int probabilidadSoleadoNublado = (int) (Math.random() * 10);

      switch (probabilidadSoleadoNublado) {
        case 0:
        case 1:
        case 2:
        case 3:
          clima = "Soleado";
          break;
        case 4:
        case 5:
        case 6:
        case 7:
        case 8:
        case 9:
          clima = "Nublado";
          break;
        default:

      }
    }
    int temperaturaMinimaAbsolutaInvierno = 0;
    int temperaturaMaximaAbsolutaInvierno = 25;
    
    if (estacion == 4) {

      int temperaturaInviernoMinima = (int) ((Math.random() * (temperaturaMaximaAbsolutaInvierno - temperaturaMinimaAbsolutaInvierno) + 1) + temperaturaMinimaAbsolutaInvierno);
      int temperaturaInviernoMaxima = (int) ((Math.random() * (temperaturaMaximaAbsolutaInvierno - temperaturaMinimaAbsolutaInvierno) + 1) + temperaturaMinimaAbsolutaInvierno);

      if (temperaturaInviernoMinima < temperaturaInviernoMaxima) {
        temperaturaMinima = temperaturaInviernoMinima;
        temperaturaMaxima = temperaturaInviernoMaxima;

      } else {
        temperaturaMaxima = temperaturaInviernoMinima;
        temperaturaMinima = temperaturaInviernoMaxima;
      }

      int probabilidadSoleadoNublado = (int) (Math.random() * 10);

      switch (probabilidadSoleadoNublado) {
        case 0:
        case 1:
        case 2:
        case 3:
        case 4:
        case 5:
        case 6:
        case 7:
          clima = "Nublado";
          break;
        case 8:
        case 9:
          clima = "Soleado";
          break;
        default:

      }
    }
    
    System.out.println("Temperatura mínima: " + temperaturaMinima);
    System.out.println("Temperatura máxima: " + temperaturaMaxima);
    System.out.println("Clima: " + clima);
  }
}
