package tema6;

import java.util.Scanner;

/**
 * Realiza un programa que pinte por pantalla una cuba con cierta cantidad de
 * agua. La capacidad será indicada por el usuario. La cuba se llenará con una
 * cantidad aleatoria de agua que puede ir entre 0 y la capacidad máxima que
 * pueda admitir. El ancho de la cuba no varía.
 *
 * @author Ander De Abrisqueta Rangel
 */
public class Ejercicio20Cuba {

  /**
   * @param args the command line arguments
   */
  public static void main(String args[]) {
    Scanner s = new Scanner(System.in);

    //Tope de la cuba
    int capacidad = 0;

    boolean esUnaCapacidadCorrecta = false;

    do {
      System.out.print("Por favor, introduzca una capacidad del cubo en litros: ");
      capacidad = Integer.parseInt(s.nextLine());
      System.out.println("");

      if (capacidad > 1) {
        esUnaCapacidadCorrecta = true;
      }

    } while (!esUnaCapacidadCorrecta);

    int litrosAgua = (int) (Math.random() * (capacidad) + 1);

    for (int i = 0; i < capacidad - litrosAgua; i++) {
      System.out.println("*     *");
      

    }
    for (int j = 0; j < litrosAgua; j++) {
        System.out.println("*-----*");
        
      }

    // Base del cubo
    System.out.println("*******");

    System.out.println("");
    System.out.println("La capacidad del cubo es " + capacidad + " l y contiene " + litrosAgua + " l de agua");
  }
}
