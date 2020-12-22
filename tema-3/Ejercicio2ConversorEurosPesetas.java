/**
  *Realiza un conversor de euros a pesetas. La cantidad de euros que se quiere
  *convertir debe ser introducida por teclado.
  *
  *@Ander De Abrisqueta Rangel
  */
public class Ejercicio2ConversorEurosPesetas { // Clase principal
  public static void main(String[] args) {
    String linea;
    
    System.out.print("Introduce la cantidad en € a convertir: " );
    float cantidadEuros = Float.parseFloat(System.console().readLine());
    
    double relacionEurosPesetas = 166.386;
    
    int convertirEurosPesetas = (int)(cantidadEuros * relacionEurosPesetas);
    
    System.out.print("La cantidad de € son: " + convertirEurosPesetas + " pecetas");
    
  }
}
