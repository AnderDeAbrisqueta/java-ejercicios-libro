package ex03adar;

import java.util.Scanner;

/**
 * Examen Programación
 *
 * 16/12/2020
 *
 * DAM 1
 *
 * Ejercicio 3:
 *
 * @author Ander De Abrisqueta Rangel
 */
public class Ex03adar3 {

  /**
   * @param args the command line arguments
   */
  public static void main(String args[]) {
    Scanner s = new Scanner(System.in);

    boolean haTerminado = false;
    String articulo = "";
    double sumaArticulos = 0.0;
    double total = 0.0;
    double baseImponible4 = 0.0;
    double ivaProducto4 = 0.0;
    double sumaIvaProducto4 = 0.0;
    double sumaBaseImponible4 = 0.0;
    double ivaProducto10 = 0.0;
    double baseImponible10 = 0.0;
    double sumaIvaProducto10 = 0.0;
    double sumaBaseImponible10 = 0.0;
    double ivaProducto21 = 0.0;
    double baseImponible21 = 0.0;
    double sumaIvaProducto21 = 0.0;
    double sumaBaseImponible21 = 0.0;

    do {
      haTerminado = false;

      System.out.print("Introduzca el nombre del artículo ('fin' para salir): ");
      articulo = s.nextLine().toLowerCase();

      if (articulo.equals("fin")) {
        haTerminado = true;

      } else {

        System.out.print("Precio por unidad para " + articulo + " (IVA incluido): ");
        double precioUnidad = Double.parseDouble(s.nextLine());

        System.out.print("Cantidad de unidades de " + articulo + ": ");
        int cantidad = Integer.parseInt(s.nextLine());

        System.out.print("Tipo de IVA aplicado a " + articulo + " (4, 10, 21): ");
        int iva = Integer.parseInt(s.nextLine());

        sumaArticulos += precioUnidad * cantidad;

        if (iva == 4) {
          baseImponible4 = precioUnidad * cantidad / 1.04;
          ivaProducto4 = (precioUnidad * cantidad) - baseImponible4;
          sumaIvaProducto4 += ivaProducto4;
          sumaBaseImponible4 += baseImponible4;
          

        }
        
        if (iva == 10) {
          baseImponible10 = precioUnidad * cantidad / 1.10;
          ivaProducto10 = (precioUnidad * cantidad) - baseImponible10;
          sumaIvaProducto10 += ivaProducto10;
          sumaBaseImponible10 += baseImponible10;

        }
        
        if (iva == 21) {
          baseImponible21 = precioUnidad * cantidad / 1.21;
          ivaProducto21 = (precioUnidad * cantidad) - baseImponible21;
          sumaIvaProducto21 += ivaProducto21;
          sumaBaseImponible21 += baseImponible21;

        }

      }

    } while (!haTerminado);
    
    System.out.println("");
    System.out.printf("TOTAL: %33.2f", sumaArticulos);
    System.out.println("");
    System.out.println("-----------------------------------------");
    System.out.printf("Base imponible   4: %6.2f", sumaBaseImponible4);
    System.out.printf(" IVA: %8.2f", sumaIvaProducto4);
    System.out.println("");
    System.out.printf("Base imponible  10: %6.2f", sumaBaseImponible10);
    System.out.printf(" IVA: %8.2f", sumaIvaProducto10);
    System.out.println("");
    System.out.printf("Base imponible  21: %6.2f", sumaBaseImponible21);
    System.out.printf(" IVA: %8.2f", sumaIvaProducto21);
    System.out.println("");
  }
}
