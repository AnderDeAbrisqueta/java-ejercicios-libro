/**
  *Realiza un conversor de euros a pesetas. La cantidad en euros que se quiere
  *convertir deberá estar almacenada en una variable.
  *
  *@Ander De Abrisqueta Rangel
  */
public class Ejercicio4ConversorEurosPecetas { // Clase principal
  public static void main(String[] args) {
    
    int pecetas;
    double euros = 100;
    double relacionPecetasEuros = 0.006;
    double conversorEurosPecetas;
    
    conversorEurosPecetas = (double) euros/ relacionPecetasEuros;
  
    System.out.printf("100€ son %.0f", conversorEurosPecetas);
    System.out.print(" pecetas");
    
  }
}


