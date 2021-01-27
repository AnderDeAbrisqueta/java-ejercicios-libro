package tema7;

import java.lang.reflect.MalformedParameterizedTypeException;
import java.util.Scanner;
import javax.swing.AbstractListModel;

/**
 *
 * @author Ander De Abrisqueta Rangel
 */
public class Ejercicio08TemperaturaMedia {

  /**
   * @param args the command line arguments
   */
  public static void main(String args[]) {
    Scanner s = new Scanner(System.in);

    String meses[] = {"Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio",
      "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre"};

    double temperaturaMedia[] = new double[12];

    //Introducción de los datos
    System.out.println("Por favor, introduzca las temperaturas media de los meses");
    int i;
    for (i = 0; i < 12; i++) {
      System.out.print(meses[i] + ": ");
      temperaturaMedia[i] = Double.parseDouble(s.nextLine());
    }

    String negro = "\033[30m";
    String verde = "\033[32m";
    String azul = "\033[34m";

    int j;
    
    for (i = 0; i < 12; i++) {
      System.out.printf(negro + "%12s" + azul + "|", meses[i]);
      for (j = 0; j < temperaturaMedia[i]; j++) {
        System.out.print(verde + "▄");
      }
      System.out.println(negro + " " + temperaturaMedia[i] + " grados celsius"); 
    }
  }
}
