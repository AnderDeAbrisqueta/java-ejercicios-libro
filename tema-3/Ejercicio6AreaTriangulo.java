/**
  *Escribe un programa que calcule el área de un triángulo.
  *
  *@Ander De Abrisqueta Rangel
  */
public class Ejercicio6AreaTriangulo { // Clase principal
  public static void main(String[] args) {
        
    System.out.print("Introduce la base del triángulo en cm: " );
    double baseTriangulo = Double.parseDouble(System.console().readLine());
    
    System.out.print("Introduce la altura del triángulo en cm: " );
    double alturaTriangulo = Double.parseDouble(System.console().readLine());
    System.out.println("");
    
    double areaTriangulo = baseTriangulo * alturaTriangulo/2;
    
    System.out.printf("El área del triángulo es: %.2f", areaTriangulo);
    System.out.print(" cm²");
        
  }
}
