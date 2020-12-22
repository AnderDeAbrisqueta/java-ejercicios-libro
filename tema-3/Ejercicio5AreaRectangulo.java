/**
  *Escribe un programa que calcule el área de un rectángulo.
  *
  *@Ander De Abrisqueta Rangel
  */
public class Ejercicio5AreaRectangulo { // Clase principal
  public static void main(String[] args) {
        
    System.out.print("Introduce la base del rectángulo en cm: " );
    double baseRectangulo = Double.parseDouble(System.console().readLine());
    
    System.out.print("Introduce la altura del rectángulo en cm: " );
    double alturaRectangulo = Double.parseDouble(System.console().readLine());
    System.out.println("");
    
    double areaRectangulo = baseRectangulo * alturaRectangulo;
    
    System.out.printf("El área del rectángulo es: %.2f", areaRectangulo);
    System.out.print(" cm²");
        
  }
}


