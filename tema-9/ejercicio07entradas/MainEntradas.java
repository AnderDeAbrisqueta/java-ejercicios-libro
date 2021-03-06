/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio07entradas;

import java.util.Scanner;

/**
 *
 * @author Ander De Abrisqueta Rangel
 */
public class MainEntradas {

  /**
   * @param args the command line arguments
   */
  public static void main(String args[]) {
    Scanner s = new Scanner(System.in);

    Zona salaPrincipal = new Zona(1000);
    Zona compraVenta = new Zona(200);
    Zona vip = new Zona(25);

    int opcionMenu = 0;
    int opcionVentaEntradas = 0;
    int cantidadEntradas = 0;

    do {

      System.out.println("Expocoches Campanillas\n");
      System.out.println("Menú: ");
      System.out.println("1. Mostrar número de entradas libres");
      System.out.println("2. Vender entradas");
      System.out.println("3. Salir\n");
      System.out.print("Por favor, introduzca una opción: ");
      opcionMenu = Integer.parseInt(s.nextLine());

      if (opcionMenu == 1) {
        System.out.println("\nEntradas Libres");
        System.out.println("\nZona Sala Principal: " + salaPrincipal.getEntradasPorVender()
                + " entradas");
        System.out.println("Zona Compra-Venta: " + compraVenta.getEntradasPorVender()
                + " entradas");
        System.out.println("Zona V.I.P: " + vip.getEntradasPorVender() + " entradas\n");
      }

      if (opcionMenu == 2) {
        System.out.println("Para qué zona quiere las entradas:");
        System.out.println("1. Sala principal");
        System.out.println("2. Compra-venta");
        System.out.println("3. V.I.P");
        System.out.print("Por favor elija una opción: ");
        opcionVentaEntradas = Integer.parseInt(s.nextLine());

        System.out.print("¿Cuántas entradas desea?: ");
        cantidadEntradas = Integer.parseInt(s.nextLine());

        switch (opcionVentaEntradas) {
          case 1:
            salaPrincipal.vender(cantidadEntradas);
            break;

          case 2:
            compraVenta.vender(cantidadEntradas);
            break;

          case 3:
            vip.vender(cantidadEntradas);
            break;
          default:
        }

      }

    } while (opcionMenu == 1 || opcionMenu == 2);
  }
}
