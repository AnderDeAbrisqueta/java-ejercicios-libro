/**
  *Escribe un programa que calcule el total de una factura a partir de la base
  *imponible.
  *
  *@Ander De Abrisqueta Rangel
  */
public class Ejercicio7CalculoFactura { // Clase principal
  public static void main(String[] args) {
        
    System.out.print("Introduce el monto de la base imponible: " );
    double baseImponible = Double.parseDouble(System.console().readLine());
    System.out.println(" €");
    
    System.out.print("Introduce el porcentaje del IVA: " );
    double iva = Double.parseDouble(System.console().readLine());
    System.out.println(" %");
    System.out.println("");
    
    double totalFactura = baseImponible + baseImponible*iva/100;
    
    System.out.printf("El total de la factura es: %.2f", totalFactura);
    System.out.println(" €");
  
  }
}
