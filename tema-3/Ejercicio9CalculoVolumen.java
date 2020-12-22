/**
  *Escribe un programa que calcule el volumen de un cono según la fórmula V = 1/3 πr²h 
  *
  *@Ander De Abrisqueta Rangel
  */
public class Ejercicio9CalculoVolumen { // Clase principal
  public static void main(String[] args) {
  
    System.out.print("Introduce el radio del cono en cm: " );
    double radio = Double.parseDouble(System.console().readLine());
    
    System.out.print("Introduce la altura del cono en cm: " );
    double altura = Double.parseDouble(System.console().readLine());
        
    double volumen = 1.0 / 3 * Math.PI * Math.pow(radio,2) * altura;
    
    System.out.println("");
    System.out.printf("El volumen del cono es: %.2f", volumen);
    System.out.print(" cm³");
      
  }
}
