/**
  *Escribe un programa que calcule el total de una factura a partir de la base
  *imponible (precio sin IVA). La base imponible estará almacenada en una
  *variable.
  *
  *@Ander De Abrisqueta Rangel
  */
public class Ejercicio6Factura { // Clase principal
  public static void main(String[] args) {
    
    double totalFactura;
    double baseImponible = 2500;
    double iva = 0.21;
    
    totalFactura = baseImponible + baseImponible * iva;
    
    System.out.println("Base imponible: 2500€");
    System.out.println("Total: " + totalFactura + "€");
  
  }
}
