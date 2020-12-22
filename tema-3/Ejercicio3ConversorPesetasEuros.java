/**
  *Realiza un conversor de pesetas a euros. La cantidad de pesetas que se quiere
  *convertir debe ser introducida por teclado.
  *
  *@Ander De Abrisqueta Rangel
  */
public class Ejercicio3ConversorPesetasEuros { // Clase principal
  public static void main(String[] args) {
    String linea;
    
    System.out.print("Introduce la cantidad en pecetas a convertir: " );
    float cantidadPecetas = Float.parseFloat(System.console().readLine());
    
    double relacionEurosPesetas = 166.386;
    
    float convertirPesetasEuros = (float)(cantidadPecetas / relacionEurosPesetas);
    
    System.out.printf("La cantidad de € son: %.2f", convertirPesetasEuros);
    System.out.print("€");
    
  }
}
