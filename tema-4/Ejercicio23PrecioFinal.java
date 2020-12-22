/**
  *Escribe un programa que calcule el precio final de un producto según su
  *base imponible (precio antes de impuestos), el tipo de IVA aplicado (general,
  *reducido o superreducido) y el código promocional. Los tipos de IVA general,
  *reducido y superreducido son del 21%, 10% y 4% respectivamente. Los códigos
  *promocionales pueden ser nopro, mitad, meno5 o 5porc que significan
  *respectivamente que no se aplica promoción, el precio se reduce a la mitad,
  *se descuentan 5 euros o se descuenta el 5%. El ejercicio se da por bueno si se
  *muestran los valores correctos, aunque los números no estén tabulados.
  *
  *@Ander De Abrisqueta Rangel
  */
public class Ejercicio23PrecioFinal { // Clase principal
  public static void main(String[] args) {
    
    System.out.println("Programa que calcula el precio final de un producto. \n");
    
    System.out.print("Por favor, Introduzca la base imponible: ");
    double baseImponible = Double.parseDouble(System.console().readLine());
    
    System.out.print("Introduzca el tipo de IVA (general, reducido o superreducido): ");
    String iva = System.console().readLine().toLowerCase();
    
    System.out.print("Por favor, introduzca el código promocional (nopro, mitad, menos5 o 5porc): ");
    String codigoPromocional = System.console().readLine().toLowerCase();
    System.out.println("");
    
    System.out.printf("Base imponible: %14.2f\n", baseImponible);
    System.out.printf("");
    
    switch (codigoPromocional) {
      case ("nopro"):

        if (iva.equals("general")) {
            double precioTotal = baseImponible * (1 + 0.21);
            System.out.printf("IVA (21%%):%20.2f\n", baseImponible * 0.21);
            System.out.printf("Precio con IVA:%15.2f\n", precioTotal);
            System.out.println("Cod. promo. (nopro):\t" + "  0,00");
            System.out.printf("TOTAL:%24.2f", precioTotal);
        } else if (iva.equals("reducido")) {
            double precioTotal = baseImponible * (1 + 0.10); 
            System.out.printf("IVA (10%%):%20.2f\n", baseImponible * 0.10);
            System.out.printf("Precio con IVA:%15.2f\n", precioTotal);
            System.out.println("Cod. promo. (nopro):\t" + "  0,00");
            System.out.printf("TOTAL:%24.2f", precioTotal);
        } else if (iva.equals("superreducido")) { 
            double precioTotal = baseImponible * (1 + 0.04);
            System.out.printf("IVA (4%%): %20.2f\n", baseImponible * 0.04);
            System.out.printf("Precio con IVA:%15.2f\n", precioTotal);
            System.out.println("Cod. promo. (nopro):\t" + "  0,00");
            System.out.printf("TOTAL:%24.2f", precioTotal);
        }    
      break;
      
      case ("mitad"):

        if (iva.equals("general")) {
          double precioPromo = baseImponible  * 0.5 * (1 + 0.21);
          double precioIva = baseImponible * (1 + 0.21);
          double precioTotal = precioIva - precioPromo;
            System.out.printf("IVA (21%%):%20.2f\n", baseImponible * 0.21);
            System.out.printf("Precio con IVA:%15.2f\n", precioIva);
            System.out.printf("Cod.promo.(mitad)(-):%9.2f\n", precioPromo);
            System.out.printf("TOTAL:%24.2f", precioTotal);
        } else if (iva.equals("reducido")) {
            double precioPromo = baseImponible * 0.5 * (1 + 0.10);
            double precioIva = baseImponible * (1 + 0.10);
            double precioTotal = precioIva - precioPromo;  
            System.out.printf("IVA (10%%):%20.2f\n", baseImponible * 0.10);
            System.out.printf("Precio con IVA:%15.2f\n", precioIva);
            System.out.printf("Cod.promo.(mitad)(-):%9.2f\n", precioPromo);
            System.out.printf("TOTAL:%24.2f", precioTotal);
        } else if (iva.equals("superreducido")) { 
            double precioPromo = baseImponible * 0.5 * (1 + 0.04);
            double precioIva = baseImponible * (1 + 0.04);
            double precioTotal = precioIva - precioPromo; 
            System.out.printf("IVA (4%%):%21.2f\n", baseImponible * 0.04);
            System.out.printf("Precio con IVA:%15.2f\n", precioIva);
            System.out.printf("Cod.promo.(mitad)(-):%9.2f\n", precioPromo);
            System.out.printf("TOTAL:%24.2f", precioTotal);
        }     
      break;
      
      case ("menos5"):

        if (iva.equals("general")) {
          double precioPromo = 5;
          double precioIva = baseImponible * (1 + 0.21);
          double precioTotal = precioIva - precioPromo;
            System.out.printf("IVA (21%%):%20.2f\n", baseImponible * 0.21);
            System.out.printf("Precio con IVA:%15.2f\n", precioIva);
            System.out.printf("Cod.promo.(menos5)(-):%8.2f\n", precioPromo);
            System.out.printf("TOTAL:%24.2f", precioTotal);       
        } else if (iva.equals("reducido")) {
            double precioPromo = 5;
            double precioIva = baseImponible * (1 + 0.10);
            double precioTotal = precioIva - precioPromo;
            System.out.printf("IVA (10%%):%20.2f\n", baseImponible * 0.10);
            System.out.printf("Precio con IVA:%15.2f\n", precioIva);
            System.out.printf("Cod.promo.(menos5)(-):%8.2f\n", precioPromo);
            System.out.printf("TOTAL:%24.2f", precioTotal);  
        } else if (iva.equals("superreducido")) { 
            double precioPromo = 5;
            double precioIva = baseImponible * (1 + 0.04);
            double precioTotal = precioIva - precioPromo;
            System.out.printf("IVA (4%%):%21.2f\n", baseImponible * 0.04);
            System.out.printf("Precio con IVA:%15.2f\n", precioIva);
            System.out.printf("Cod.promo.(menos5)(-):%8.2f\n", precioPromo);
            System.out.printf("TOTAL:%24.2f", precioTotal); 
        } 
      break;
      
      case ("5porc"):

        if (iva.equals("general")) {
          double precioPromo = baseImponible  * 0.05 * (1 + 0.21);
          double precioIva = baseImponible * (1 + 0.21);
          double precioTotal = precioIva - precioPromo;
            System.out.printf("IVA (21%%):%20.2f\n", baseImponible * 0.21);
            System.out.printf("Precio con IVA:%15.2f\n", precioIva);
            System.out.printf("Cod.promo.(5porc)(-):%9.2f\n", precioPromo);
            System.out.printf("TOTAL:%24.2f", precioTotal);         
        } else if (iva.equals("reducido")) {
          double precioPromo = baseImponible * 0.05 * (1 + 0.10); 
          double precioIva = baseImponible * (1 + 0.10);
          double precioTotal = precioIva - precioPromo;
            System.out.printf("IVA (10%%):%20.2f\n", baseImponible * 0.10);
            System.out.printf("Precio con IVA:%15.2f\n", precioIva);
            System.out.printf("Cod.promo.(5porc)(-):%9.2f\n", precioPromo);
            System.out.printf("TOTAL:%24.2f", precioTotal);
        } else if (iva.equals("superreducido")) { 
          double precioPromo = baseImponible * 0.05 * (1 + 0.04);
          double precioIva = baseImponible * (1 + 0.04);
          double precioTotal = precioIva - precioPromo;
            System.out.printf("IVA (4%%):%21.2f\n", baseImponible * 0.04);
            System.out.printf("Precio con IVA:%15.2f\n", precioIva);
            System.out.printf("Cod.promo.(5porc)(-):%9.2f\n", precioPromo);
            System.out.printf("TOTAL:%24.2f", precioTotal);
        } 
        break;
            
    default:
      System.out.println("No es un Código Promocional");
    }  
            
  }
}
