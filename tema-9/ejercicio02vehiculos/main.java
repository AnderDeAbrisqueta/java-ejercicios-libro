/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio02vehiculos;

import java.util.Scanner;

/**
 *
 * @author Ander De Abrisqueta Rangel
 */
public class main {

  /**
   * @param args the command line arguments
   */
  public static void main(String args[]) {
    Scanner s = new Scanner(System.in);

    int opcion = 0;
    int km = 0;

    Bicicleta btwinBicicleta = new Bicicleta("Montañera");
    Coche vwCoche = new Coche();

    while (opcion != 8) {
      System.out.println("1. Anda con la bicicleta");
      System.out.println("2. Haz el caballito con la bicicleta");
      System.out.println("3. Anda con el coche");
      System.out.println("4. Quema rueda con el coche");
      System.out.println("5. Ver kilometraje de la bicicleta");
      System.out.println("6. Ver kilometraje del coche");
      System.out.println("7. Ver kilometraje total");
      System.out.println("8. Salir");
      System.out.print("Elige una opción (1-8): ");
      opcion = Integer.parseInt(s.nextLine());

      switch (opcion) {
        case 1:
          System.out.println("¿Cuántos km vas a recorrer hoy? ");
          km = Integer.parseInt(s.nextLine());
          btwinBicicleta.recorre(km);
          break;

        case 2:
          btwinBicicleta.hazCaballito();
          break;

        case 3:
          System.out.println("¿Cuántos km vas a recorrer hoy?");
          km = Integer.parseInt(s.nextLine());
          vwCoche.recorre(km);
          break;

        case 4:
          vwCoche.quemaRueda();
          break;

        case 5:
          System.out.print("El total recorrido por la bici es: ");
          System.out.println(btwinBicicleta.getKilometrosRecorridos() + " km");
          break;

        case 6:
          System.out.print("El total recorrido por el coche es: ");
          System.out.println(vwCoche.getKilometrosRecorridos() + " km");
          break;

        case 7:
          System.out.print("El total recorrido por los vehículos es: ");
          System.out.println(Vehiculo.getKilometrosTotales() + " km");
          break;

        default:
      }//Fin del Switch
    }//Fin del While

  }
}
