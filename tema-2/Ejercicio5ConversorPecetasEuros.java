/**
  *Realiza un conversor de pesetas a euros. La cantidad en pesetas que se quiere
  *convertir deberá estar almacenada en una variable.
  *
  *@Ander De Abrisqueta Rangel
  */
public class Ejercicio5ConversorPecetasEuros { // Clase principal
  public static void main(String[] args) {
    
    int pecetas = 100;
    double euros;
    double relacionPecetasEuros = 0.006;
    double conversorPecetasEuros;
    
    conversorPecetasEuros = (double) pecetas * relacionPecetasEuros;
        
    
    System.out.println("100 pecetas son " + conversorPecetasEuros + "€");
    
    
        
  }
}
