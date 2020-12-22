/**
  *Realiza un programa que resuelva una ecuación de primer grado (del tipo ax+b = 0).
  *
  *@Ander De Abrisqueta Rangel
  */
public class Ejercicio5Ecuacion { // Clase principal
  public static void main(String[] args) {
    
    System.out.println("Programa que resuelve una ecuación de primer grado");
    
    System.out.print("Por favor, introduzca el valor de a: ");
    double a = Double.parseDouble(System.console().readLine());
    
    System.out.print("Por favor, introduzca el valor de b: ");
    double b = Double.parseDouble(System.console().readLine());
    
    double x;
    
    if ((a == 0)) {
      
      System.out.print("No tiene un valor definido");
      
    } else {  
    
    x = (double)-b/a;
    
    System.out.println("El valor de x = " + x);
    
    }
  }
}
